// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.nongped.protobuf.common.Commons



sealed trait PolicyChargeType extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = PolicyChargeType
  def isNight: Boolean = false
  def isPercentage: Boolean = false
  def isAmount: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[PolicyChargeType] = com.nongped.protobuf.common.Commons.PolicyChargeType
}

object PolicyChargeType extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[PolicyChargeType] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[PolicyChargeType] = this
  @SerialVersionUID(0L)
  case object Night extends PolicyChargeType {
    val value = 0
    val index = 0
    val name = "Night"
    override def isNight: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Percentage extends PolicyChargeType {
    val value = 1
    val index = 1
    val name = "Percentage"
    override def isPercentage: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object Amount extends PolicyChargeType {
    val value = 2
    val index = 2
    val name = "Amount"
    override def isAmount: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends PolicyChargeType with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(Night, Percentage, Amount)
  def fromValue(value: Int): PolicyChargeType = value match {
    case 0 => Night
    case 1 => Percentage
    case 2 => Amount
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = CommonsProto.javaDescriptor.getEnumTypes.get(6)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = CommonsProto.scalaDescriptor.enums(6)
}