/**
 * @author adam
 * @date 2019/5/9 15:37
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public enum  DataBaseType {
    /**
     * MYSQL
     */
    MYSQL("com.mysql.jdbc.Driver"),

    /**
     * ORACLE
     */
    ORACLE("oracle.jdbc.driver.OracleDriver"),

    /**
     * POSTGRESQL
     */
    POSTGRESQL("org.postgresql.Driver"),

    /**
     * SQLSERVER
     */
    SQLSERVER("com.microsoft.sqlserver.jdbc.SQLServerDriver"),

    /**
     * ELASTICSEARCH
     */
    ELASTICSEARCH("elasticsearch");

    /**
     * 括号里面是几个参数，就需要定义几个字段，语法糖(●ˇ∀ˇ●)
     */
    private String name;

    DataBaseType(String name) {
        this.name = name;
    }

    /**
     * 枚举类中避免出现set方法，毕竟是个final，违背初衷
     */
    public String getName() {
        return name;
    }

    public static final String AAA = "汪汪汪";

    public static void main(String[] args){
        System.out.println("容易忽略差别导致出错的name属性和name方法：");
        System.out.println("name属性返回值：" + DataBaseType.MYSQL.name);
        System.out.println("name方法返回值：" + DataBaseType.MYSQL.name());
        System.out.println("getName()方法返回值：" + DataBaseType.MYSQL.getName());
    }


}
