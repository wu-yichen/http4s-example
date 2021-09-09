name := "http4s-exercise"

version := "0.1"

scalaVersion := "2.13.6"

val Http4sVersion = "1.0.0-M25"
val CirceVersion = "0.15.0-M1"
libraryDependencies ++= Seq(
  "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
  "org.http4s"      %% "http4s-circe"        % Http4sVersion,
  "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
  "io.circe"        %% "circe-generic"       % CirceVersion,
)