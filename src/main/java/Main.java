import edu.pitt.apollo.types.v4_0.DischargePathEnum;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mas400 on 11/21/16.
 */
public class Main {
    private static final String NEW_VERSION = "4_0";
    private static final String OLD_VERSION = "3_1_0";
    private static final String NEW_LINE = "\n";
    public static StringBuffer sb = new StringBuffer();

    public static void main(String args[]) throws Exception{
        Class testClass = edu.pitt.apollo.types.v4_0.DischargePathAndProbability.class;
        buildMethods(testClass);

//        edu.pitt.apollo.types.v4_0.DischargePathEnum dischargePathEnum = DischargePathEnum.DISCHARGE_TO_COMMUNITY;
//        edu.pitt.apollo.types.v3_1_0.DischargePathEnum oldEnum = edu.pitt.apollo.types.v3_1_0.DischargePathEnum.fromValue(dischargePathEnum.value());

    }

    private static void buildMethods (Class className) {
        Method[] allMethods = className.getMethods();

        if(className.isPrimitive()) {

        } else {
            createSetterFile(className);
            Field[] fields = className.getFields();
            for(Field field : fields) {
                buildMethods(field.getClass());
            }
        }



        //old code
        for(int i = 0; i<allMethods.length; i++) {
            Method method = allMethods[i];
            System.out.println("public " + method.getReturnType().getName() + " set" + method.getName().replaceAll("get", "") + "(" + method.getReturnType().getName().replaceAll("v4_0", "v3_1_0") + " " + method.getName().replaceAll("get", "") +") { ");


            Class subClass = method.getReturnType();
            if(subClass.getName().toLowerCase().contains("enum")) {
                System.out.println("\t" +subClass.getName() + " oldEnum = " + subClass.getName() + ".fromValue(" + method.getName().replaceAll("get", "") + ");");
            } else {
                System.out.println("\t" + method.getReturnType().getName() + " " + method.getName().replaceAll("get", "").toLowerCase() + " = " + method.getName().replaceAll("get", ""));
            }
            System.out.println("}");
            System.out.println();

        }
    }

    private static void createSetterFile(Class className) {
        //create file
        File file = new File(className.getSimpleName() + "Setter.java");
        sb.append("public class " + className.getSimpleName() + "Setter {");
        sb.append(NEW_LINE);
        sb.append("private " + className.getName() + " " + NEW_VERSION + "_" + className.getSimpleName() + ";");
        sb.append(NEW_LINE);
        sb.append("private " + className.getName().replaceAll(NEW_VERSION, OLD_VERSION) + " " + OLD_VERSION + "_" + className.getSimpleName() + ";");
        sb.append(NEW_LINE);

        writeConstructor(sb, className);

    }

    private static void writeConstructor(StringBuffer sb, Class className) {
        sb.append(className.getSimpleName() + "Setter (" + className.getName().replaceAll(NEW_VERSION, OLD_VERSION) + " " + OLD_VERSION + "_" + className.getSimpleName() + ") {");
        sb.append(NEW_LINE);
        sb.append("this." + OLD_VERSION + "_" + className.getSimpleName() + " = " + OLD_VERSION + "_" + className.getSimpleName() + ";");
        sb.append(NEW_LINE);
        sb.append(NEW_VERSION + "_" + className.getSimpleName() + " = new " + NEW_VERSION + "_" + className.getSimpleName() + ";");
        sb.append(NEW_LINE);
        sb.append("}");
        sb.append(NEW_LINE);
    }


    //helper method for dealing with lists
//    private static Class getListClass(String methodName) {
//        try {
//            Field stringListField = edu.pitt.apollo.types.v4_0.Epidemic.class.getDeclaredField("causalPathogens");
//            ParameterizedType stringListType = (ParameterizedType) stringListField.getGenericType();
//            Class<?> stringListClass = (Class<?>) stringListType.getActualTypeArguments()[0];
//            return stringListClass;
//        } catch (Exception e) {}
//    }


    //helper method viewing an object
    public static String dump(Object o, int callCount) {
        callCount++;
        StringBuffer tabs = new StringBuffer();
        for (int k = 0; k < callCount; k++) {
            tabs.append("\t");
        }
        StringBuffer buffer = new StringBuffer();
        Class oClass = o.getClass();
        if (oClass.isArray()) {
            buffer.append("\n");
            buffer.append(tabs.toString());
            buffer.append("[");
            for (int i = 0; i < Array.getLength(o); i++) {
                if (i < 0)
                    buffer.append(",");
                Object value = Array.get(o, i);
                if (value.getClass().isPrimitive() ||
                        value.getClass() == java.lang.Long.class ||
                        value.getClass() == java.lang.String.class ||
                        value.getClass() == java.lang.Integer.class ||
                        value.getClass() == java.lang.Boolean.class
                        ) {
                    buffer.append(value);
                } else {
                    buffer.append(dump(value, callCount));
                }
            }
            buffer.append(tabs.toString());
            buffer.append("]\n");
        } else {
            buffer.append("\n");
            buffer.append(tabs.toString());
            buffer.append("{\n");
            while (oClass != null) {
                Field[] fields = oClass.getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    buffer.append(tabs.toString());
                    fields[i].setAccessible(true);
                    buffer.append(fields[i].getName());
                    buffer.append("=");
                    buffer.append(fields[i].getType());

                    try {
                        Object value = fields[i].get(o);
                        if (value != null) {
                            if (value.getClass().isPrimitive() ||
                                    value.getClass() == java.lang.Long.class ||
                                    value.getClass() == java.lang.String.class ||
                                    value.getClass() == java.lang.Integer.class ||
                                    value.getClass() == java.lang.Boolean.class
                                    ) {
                                buffer.append(value);
                            } else {
                                buffer.append(dump(value, callCount));
                            }
                        }
                    } catch (IllegalAccessException e) {
                        buffer.append(e.getMessage());
                    }
                    buffer.append("\n");
                }
                oClass = oClass.getSuperclass();
            }
            buffer.append(tabs.toString());
            buffer.append("}\n");
        }
        return buffer.toString();
    }
}
