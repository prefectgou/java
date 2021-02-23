/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.quantization;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.types.family.TNumber;

/**
 * Returns the gradient of `QuantizeAndDequantizeV4`.
 * <p>
 * Returns a gradient of 1 for inputs that are within the quantization range,
 * or 0 otherwise.
 * 
 * @param <T> data type for {@code inputBackprop()} output
 */
@Operator(group = "quantization")
public final class QuantizeAndDequantizeV4Grad<T extends TNumber> extends RawOp {
  
  /**
   * Optional attributes for {@link org.tensorflow.op.quantization.QuantizeAndDequantizeV4Grad}
   */
  public static class Options {
    
    /**
     * @param axis 
     */
    public Options axis(Long axis) {
      this.axis = axis;
      return this;
    }
    
    private Long axis;
    
    private Options() {
    }
  }
  
  /**
   * Factory method to create a class wrapping a new QuantizeAndDequantizeV4Grad operation.
   * 
   * @param scope current scope
   * @param gradients 
   * @param input 
   * @param inputMin 
   * @param inputMax 
   * @param options carries optional attributes values
   * @return a new instance of QuantizeAndDequantizeV4Grad
   */
  @Endpoint(describeByClass = true)
  public static <T extends TNumber> QuantizeAndDequantizeV4Grad<T> create(Scope scope, Operand<T> gradients, Operand<T> input, Operand<T> inputMin, Operand<T> inputMax, Options... options) {
    OperationBuilder opBuilder = scope.env().opBuilder("QuantizeAndDequantizeV4Grad", scope.makeOpName("QuantizeAndDequantizeV4Grad"));
    opBuilder.addInput(gradients.asOutput());
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(inputMin.asOutput());
    opBuilder.addInput(inputMax.asOutput());
    opBuilder = scope.apply(opBuilder);
    if (options != null) {
      for (Options opts : options) {
        if (opts.axis != null) {
          opBuilder.setAttr("axis", opts.axis);
        }
      }
    }
    return new QuantizeAndDequantizeV4Grad<T>(opBuilder.build());
  }
  
  /**
   * @param axis 
   */
  public static Options axis(Long axis) {
    return new Options().axis(axis);
  }
  
  /**
   */
  public Output<T> inputBackprop() {
    return inputBackprop;
  }
  
  /**
   */
  public Output<T> inputMinBackprop() {
    return inputMinBackprop;
  }
  
  /**
   */
  public Output<T> inputMaxBackprop() {
    return inputMaxBackprop;
  }
  
  /** The name of this op, as known by TensorFlow core engine */
  public static final String OP_NAME = "QuantizeAndDequantizeV4Grad";
  
  private Output<T> inputBackprop;
  private Output<T> inputMinBackprop;
  private Output<T> inputMaxBackprop;
  
  private QuantizeAndDequantizeV4Grad(Operation operation) {
    super(operation);
    int outputIdx = 0;
    inputBackprop = operation.output(outputIdx++);
    inputMinBackprop = operation.output(outputIdx++);
    inputMaxBackprop = operation.output(outputIdx++);
  }
}