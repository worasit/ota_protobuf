// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.nongped.protobuf.common.Commons



sealed trait OccupancyModel extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = OccupancyModel
  def isFullRate: Boolean = false
  def isExtraPerson: Boolean = false
  def isExtraAdultAndChild: Boolean = false
  def isRateMatrix: Boolean = false
  def isRateMatrixAdultAndChild: Boolean = false
  def isFullPatternLengthOfStay: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[OccupancyModel] = com.nongped.protobuf.common.Commons.OccupancyModel
}

object OccupancyModel extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[OccupancyModel] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[OccupancyModel] = this
  @SerialVersionUID(0L)
  case object FullRate extends OccupancyModel {
    val value = 0
    val index = 0
    val name = "FullRate"
    override def isFullRate: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object ExtraPerson extends OccupancyModel {
    val value = 1
    val index = 1
    val name = "ExtraPerson"
    override def isExtraPerson: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object ExtraAdultAndChild extends OccupancyModel {
    val value = 2
    val index = 2
    val name = "ExtraAdultAndChild"
    override def isExtraAdultAndChild: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object RateMatrix extends OccupancyModel {
    val value = 3
    val index = 3
    val name = "RateMatrix"
    override def isRateMatrix: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object RateMatrixAdultAndChild extends OccupancyModel {
    val value = 4
    val index = 4
    val name = "RateMatrixAdultAndChild"
    override def isRateMatrixAdultAndChild: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object FullPatternLengthOfStay extends OccupancyModel {
    val value = 5
    val index = 5
    val name = "FullPatternLengthOfStay"
    override def isFullPatternLengthOfStay: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends OccupancyModel with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(FullRate, ExtraPerson, ExtraAdultAndChild, RateMatrix, RateMatrixAdultAndChild, FullPatternLengthOfStay)
  def fromValue(value: Int): OccupancyModel = value match {
    case 0 => FullRate
    case 1 => ExtraPerson
    case 2 => ExtraAdultAndChild
    case 3 => RateMatrix
    case 4 => RateMatrixAdultAndChild
    case 5 => FullPatternLengthOfStay
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = CommonsProto.javaDescriptor.getEnumTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = CommonsProto.scalaDescriptor.enums(0)
}