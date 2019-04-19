class S1 {
  import org.apache.spark.sql.SparkSession
  import org.apache.spark.{SparkConf, SparkContext}
  //Une classe contenant le script
  class S1() {
    //début du script
    import org.apache.spark.sql.SparkSession
    import org.apache.spark.{SparkConf, SparkContext}
    val conf = new SparkConf().setAppName("TME").setMaster("local[*]").set("spark.driver.memory", "8g").set("spark.executor.memory", "8g")
    val spark = SparkSession.builder.config(conf).getOrCreate()
    spark.sparkContext.setLogLevel("ERROR")
    import spark.implicits._

  } // fin de la classe
}
