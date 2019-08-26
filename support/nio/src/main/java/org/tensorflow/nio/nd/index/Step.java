/*
 Copyright 2019 The TensorFlow Authors. All Rights Reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 =======================================================================
 */
package org.tensorflow.nio.nd.index;

import org.tensorflow.nio.nd.impl.dimension.Dimension;
import org.tensorflow.nio.nd.impl.dimension.Dimensions;

/**
 * An index that skips a fixed amount of coordinates between each values returned.
 *
 * <p>For example, given a vector with {@code n} elements on the {@code x} axis,
 * {@code step(k)} returns x<sub>0</sub>, x<sub>k</sub>, x<sub>k*2</sub>, ...
 */
class Step implements Index {

  @Override
  public long numElements(Dimension dim) {
    return (dim.numElements() / stepLength) + 1; // FIXME always include element 0?
  }

  @Override
  public long mapCoordinate(long coordinate, Dimension dim) {
    return coordinate * stepLength;
  }

  Step(long stepLength) {
    this.stepLength = stepLength;
  }

  private final long stepLength;
}
