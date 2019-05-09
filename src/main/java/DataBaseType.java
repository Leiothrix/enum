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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args){
        System.out.println(DataBaseType.MYSQL.name);
        System.out.println(DataBaseType.ORACLE.name);
        System.out.println(DataBaseType.POSTGRESQL.name);
        System.out.println(DataBaseType.SQLSERVER.name);
    }


}
