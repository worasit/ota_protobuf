name := "ota_protobuf"

version := "1.0"

scalaVersion := "2.12.3"

organization := "com.nongped"

//PB.targets in Compile := Seq(
//  scalapb.gen() -> (sourceManaged in Compile).value
//)

PB.targets in Compile := Seq(
  PB.gens.java -> (sourceManaged in Compile).value,
  scalapb.gen(javaConversions = true) -> (sourceManaged in Compile).value
)

libraryDependencies += "com.trueaccord.scalapb" %% "scalapb-runtime" % com.trueaccord.scalapb.compiler.Version.scalapbVersion % "protobuf"