/*
 * Copyright 2013 Centro de Investigación en Tecnoloxías da Información (CITIUS).
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
package es.usc.citius.lab.hipster.function;

/**
 * A scalar operation transforms an operator using
 * a numerical value.
 * 
 * @author Adrián González Sieira <adrian.gonzalez@usc.es>
 * @author Pablo Rodríguez Mier <pablo.rodriguez.mier@usc.es>
 *
 * @param <E> operator class
 */
public interface ScalarFunction<E> {
	
	/**
	 * Scales the first operator with the second numerical value.
	 * 
	 * @param a operator to scale
	 * @param b scaling factor
	 * @return result
	 */
	E scale(E a, double b);
	
}
