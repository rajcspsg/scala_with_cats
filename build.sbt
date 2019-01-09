name := "scala_with_cats"

version := "0.1"

scalaVersion := "2.12.8"

lazy val scala_with_cats = (project in file(".")).settings(CommonSettings.commonSettings: _*)

lazy val ch_1_intro = project.settings(CommonSettings.commonSettings: _*)
lazy val ch_2_monoids = project.settings(CommonSettings.commonSettings: _*)
lazy val ch_3_functors = project.settings(CommonSettings.commonSettings: _*)
lazy val ch4_monads = project.settings(CommonSettings.commonSettings: _*)
lazy val ch7_fold_traversable = project.settings(CommonSettings.commonSettings: _*)