/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tech.tablesaw.sorting;

public class IntComparisonUtil {

    private static IntComparisonUtil instance = new IntComparisonUtil();

    private IntComparisonUtil() {
    }

    public static IntComparisonUtil getInstance() {
        return instance;
    }

    public int compare(int a, int b) {
        return a - b;
    }
}
