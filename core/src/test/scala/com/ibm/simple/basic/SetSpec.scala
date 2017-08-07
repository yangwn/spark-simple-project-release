package com.ibm.simple.basic

import org.scalatest.FlatSpec
import com.ibm.simple.UnitSpec

class SetSpec extends UnitSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }

}