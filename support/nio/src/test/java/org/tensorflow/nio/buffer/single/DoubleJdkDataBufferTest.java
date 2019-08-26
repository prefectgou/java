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
package org.tensorflow.nio.buffer.single;

import org.tensorflow.nio.buffer.DoubleDataBuffer;
import org.tensorflow.nio.buffer.DoubleDataBufferTestBase;

public class DoubleJdkDataBufferTest extends DoubleDataBufferTestBase {
  
  @Override
  protected long maxCapacity() {
    return DoubleJdkDataBuffer.MAX_CAPACITY;
  }

  @Override
  protected DoubleDataBuffer allocate(long capacity) {
    return DoubleJdkDataBuffer.allocate(capacity);
  }
}
