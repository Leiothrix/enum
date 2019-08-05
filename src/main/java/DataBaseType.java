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

    private String name;

    DataBaseType(String name) {
        this.name = name;
    }

    /**
     * 枚举类中不应出现set方法，毕竟是个final，加set违背初衷
     */
    public String getName() {
        return name;
    }

    public static final String AAA = "汪汪汪";

    public static void main(String[] args){
        System.out.println(DataBaseType.MYSQL.getName());
        System.out.println(DataBaseType.ORACLE.getName());
        System.out.println(DataBaseType.POSTGRESQL.getName());
        System.out.println(DataBaseType.SQLSERVER.getName());
    }
}
