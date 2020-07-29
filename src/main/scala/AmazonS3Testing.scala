import org.apache.spark.sql.SparkSession
import java.util.Properties
import org.apache.spark.{SparkConf, SparkContext}
object AmazonS3Testing {
    def main(args: Array[String]): Unit = {
        val spark = SparkSession.builder.master("local[*]").appName("ReadS3Files").getOrCreate()
        val property = new Properties {
            setProperty("user", "SA")
            setProperty("password", "Gaurav@05946")
            setProperty("driver", "com.microsoft.sqlserver.jdbc.SQLServerDriver")
        }
        val sqlurl = "jdbc:sqlserver://localhost:1433;database=master"
        val df = spark.read.jdbc(url=sqlurl, table="D_ASSET_JOB_TRACKING", properties=property)
        df.write.jdbc(url=sqlurl, table="D_ASSET_JOB_TRACKING4", connectionProperties=property)
    }
}
