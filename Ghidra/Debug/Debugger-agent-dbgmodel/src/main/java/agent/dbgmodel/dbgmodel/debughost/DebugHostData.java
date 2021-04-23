/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package agent.dbgmodel.dbgmodel.debughost;

import com.sun.jna.platform.win32.Variant.VARIANT;

import agent.dbgmodel.jna.dbgmodel.DbgModelNative.LOCATION;

/**
 * A wrapper for {@code IDebugHostData} and its newer variants.
 */
public interface DebugHostData extends DebugHostBase {

	int getLocationKind();

	LOCATION getLocation();

	VARIANT getValue();
}