// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.nongped.protobuf.common.Commons



sealed trait PaymentType extends _root_.com.trueaccord.scalapb.GeneratedEnum {
  type EnumType = PaymentType
  def isisFree: Boolean = false
  def isisTaxable: Boolean = false
  def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[PaymentType] = com.nongped.protobuf.common.Commons.PaymentType
}

object PaymentType extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[PaymentType] {
  implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[PaymentType] = this
  @SerialVersionUID(0L)
  case object isFree extends PaymentType {
    val value = 0
    val index = 0
    val name = "isFree"
    override def isisFree: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case object isTaxable extends PaymentType {
    val value = 1
    val index = 1
    val name = "isTaxable"
    override def isisTaxable: Boolean = true
  }
  
  @SerialVersionUID(0L)
  case class Unrecognized(value: Int) extends PaymentType with _root_.com.trueaccord.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(isFree, isTaxable)
  def fromValue(value: Int): PaymentType = value match {
    case 0 => isFree
    case 1 => isTaxable
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = CommonsProto.javaDescriptor.getEnumTypes.get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = CommonsProto.scalaDescriptor.enums(7)
}