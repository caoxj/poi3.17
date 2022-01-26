/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */
//sou//////////////////////////////////////////////////////
package org.apache.poi.ss.formula.functions;

import static org.junit.Assert.*;

import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.junit.Test;

/**
 * Test case for INT()
 */
public final class TestInt {
    @Test
    public void testIntArg() {
        ValueEval numArg = new NumberEval(158.17*50);
        ValueEval[] args = { numArg };
        ValueEval result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        ValueEval testResult = new NumberEval(7908);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(-158.17*50);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(-7909);
        assertEquals(testResult.toString(), result.toString());

        //Confirm the MS sample
        numArg = new NumberEval(8.9);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(8);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(-8.9);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(-9);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(0);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(0);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(8.4);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(8);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(8.5);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(8);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(-8.4);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(-9);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(-8.5);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(-9);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(880000000*0.00849/3);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(2490400);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(760000000*0.00981/3);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(2485200);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(1570000000*0.00879/3);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(4600100);
        assertEquals(testResult.toString(), result.toString());


        numArg = new NumberEval(1105296.94325*(-44498)/365);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(-134749325);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(15943904675233800d*0.499999967116712);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(7971951813328890d);
        assertEquals(testResult.toString(), result.toString());

        numArg = new NumberEval(15943904675233800d*0.0550000020019346);
        args[0] = numArg;
        result = NumericFunction.INT.evaluate(args, -1, (short)-1);
        testResult = new NumberEval(876914789056513d);
        assertEquals(testResult.toString(), result.toString());
    }

    @Test
    public void testSumArg() {
        //ValueEval numArg = new NumberEval(158.17*50);
        ValueEval[] args = {
        		new NumberEval(7971951813328890L),
        		new NumberEval(3188781003833340L),
        		new NumberEval(1195792916283390L),
        		new NumberEval(876914789056512L),
        		new NumberEval(797195297095680L),
        		new NumberEval(637756212510720L),
        		new NumberEval(318878160781312L),
        		new NumberEval(318878160781312L),
        		new NumberEval(318878160781312L),
        		new NumberEval(318878160781312L)
        		};
        ValueEval result = AggregateFunction.SUM.evaluate(args, -1, (short)-1);
        ValueEval testResult = new NumberEval(15943904675233800L);
        assertEquals(testResult.toString(), result.toString());
    }

    @Test
    public void testSumArg1() {
        //ValueEval numArg = new NumberEval(158.17*50);
        ValueEval[] args = {
        		new NumberEval(7.97195E+15),
        		new NumberEval(3.18878E+15),
        		new NumberEval(1.19579E+15),
        		new NumberEval(8.76915E+14),
        		new NumberEval(7.97195E+14),
        		new NumberEval(6.37756E+14),
        		new NumberEval(3.18878E+14),
        		new NumberEval(3.18878E+14),
        		new NumberEval(3.18878E+14),
        		new NumberEval(3.18878E+14)
        		};
        ValueEval result = AggregateFunction.SUM.evaluate(args, -1, (short)-1);
        ValueEval testResult = new NumberEval(15943904675233800L);
        assertEquals(testResult.toString(), result.toString());
    }

    @Test
    public void testSumArg2() {
        //ValueEval numArg = new NumberEval(158.17*50);
        ValueEval[] args = {
        		new NumberEval(7971951813328890.0),
        		new NumberEval(3188781003833340.0),
        		new NumberEval(1195792916283390.0),
        		new NumberEval(876914789056512.0),
        		new NumberEval(797195297095680.0),
        		new NumberEval(637756212510720.0),
        		new NumberEval(318878160781312.0),
        		new NumberEval(318878160781312.0),
        		new NumberEval(318878160781312.0),
        		new NumberEval(318878160781312.0)
        		};
        ValueEval result = AggregateFunction.SUM.evaluate(args, -1, (short)-1);
        ValueEval testResult = new NumberEval(15943904675233800.0);
        assertEquals(testResult.toString(), result.toString());
    }

    @Test
    public void testSumArg3() {
        //ValueEval numArg = new NumberEval(158.17*50);
        ValueEval[] args = {
        		new NumberEval(7971951813328890d),
        		new NumberEval(3188781003833340d),
        		new NumberEval(1195792916283390d),
        		new NumberEval(876914789056512d),
        		new NumberEval(797195297095680d),
        		new NumberEval(637756212510720d),
        		new NumberEval(318878160781312d),
        		new NumberEval(318878160781312d),
        		new NumberEval(318878160781312d),
        		new NumberEval(318878160781312d)
        		};
        ValueEval result = AggregateFunction.SUM.evaluate(args, -1, (short)-1);
        ValueEval testResult = new NumberEval(15943904675233800d);
        assertEquals(testResult.toString(), result.toString());
    }


}
