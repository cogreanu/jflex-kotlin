/*
 * Copyright (C) 2019-2020 Google, LLC.
 * SPDX-License-Identifier: BSD-3-Clause
 */
package de.jflex.ucd_generator.util;

import static com.google.common.truth.Truth.assertThat;
import static de.jflex.testing.assertion.MoreAsserts.assertThrows;

import org.junit.Test;

/** Test for {@link HexaUtils}. */
public class HexaUtilsTest {
  @Test
  public void intFromHexa_int() {
    assertThat(HexaUtils.intFromHexa("FF")).isEqualTo(255);
  }

  @Test
  public void intFromHexa_empty() {
    assertThat(HexaUtils.intFromHexa("")).isNull();
  }

  @Test
  public void intFromHexa_other() {
    assertThrows(IllegalArgumentException.class, () -> HexaUtils.intFromHexa("wtf"));
  }
}
