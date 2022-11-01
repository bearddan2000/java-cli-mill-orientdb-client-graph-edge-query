import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
    "org.projectlombok:lombok:1.18.8",
    "com.orientechnologies:orientdb-core:3.0.5",
    "com.orientechnologies:orientdb-client:3.0.5",
    "com.orientechnologies:orientdb-object:3.0.5",
    "com.orientechnologies:orientdb-graphdb:3.0.5",
    "javax.annotation:javax.annotation-api:1.3.2"
   )
}
