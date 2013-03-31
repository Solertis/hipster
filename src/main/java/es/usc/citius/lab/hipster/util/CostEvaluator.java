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

package es.usc.citius.lab.hipster.util;

import es.usc.citius.lab.hipster.function.CostFunction;
import es.usc.citius.lab.hipster.node.Node;
import java.util.List;

/**
 *
 * @author Adrián González Sieira
 * @since 26-03-2013
 * @version 1.0
 */
public interface CostEvaluator<S, T> {
    
    public T evaluate(List<Node<S>> path, CostFunction<S, T> costFunction);
    
}
