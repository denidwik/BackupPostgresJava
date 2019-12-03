import java.io.File;

public class Constant {

//    public static final String DATABASE_URL = "jdbc:postgresql://localhost:5433/core_core";
    public static final String DATABASE_URL = "jdbc:postgresql://172.24.16.51:5432/core"; //uat & prod
    public static final String DATABASE_USER = "postgres";
//    public static final String DATABASE_PASSWORD = "postgres"; //dev & uat
    public static final String DATABASE_PASSWORD = "D1m2019#"; //prod
//   public static final String PG_DUMP_TEMP = "C:\\Program Files\\PostgreSQL\\10\\bin\\pg_dump.exe"; //development
    public static final String PG_DUMP_TEMP = "C:\\Program Files\\PostgreSQL\\9.6\\bin\\pg_dump.exe"; //uat & prod
    public static final String FILE_BACKUP = "E:" + File.separator + "Source" + File.separator + "BACKUPDB" + File.separator + "backup_";
}
