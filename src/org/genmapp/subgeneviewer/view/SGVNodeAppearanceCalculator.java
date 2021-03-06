/*******************************************************************************
 * Copyright 2010 Alexander Pico
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.genmapp.subgeneviewer.view;


import giny.model.Node;

import java.awt.Color;

import org.genmapp.subgeneviewer.splice.controller.SpliceController;

import cytoscape.CyNetwork;
import cytoscape.CyNode;
import cytoscape.Cytoscape;
import cytoscape.data.CyAttributes;
import cytoscape.visual.NodeAppearance;
import cytoscape.visual.NodeAppearanceCalculator;
import cytoscape.visual.NodeShape;
import cytoscape.visual.VisualPropertyType;

public class SGVNodeAppearanceCalculator extends NodeAppearanceCalculator {
	
	public static int FEATURE_NODE_WIDTH = 50;
	public static int FEATURE_NODE_HEIGHT = 25;
	
	public SGVNodeAppearanceCalculator() {
		

	}
	
	public void calculateNodeAppearance(NodeAppearance appr, Node node,
			CyNetwork network) {
		super.calculateNodeAppearance(appr, node, network);
		
		CyAttributes nodeAttribs = Cytoscape.getNodeAttributes();
		String feature_id = node.getIdentifier();
		
			
			//Node label
			String label = nodeAttribs.getStringAttribute(feature_id, "label");
			appr.set(VisualPropertyType.NODE_LABEL, label != null ? label : feature_id);
//			
//			//Node shape
//			setNodeSizeLocked(false);
//			appr.set(VisualPropertyType.NODE_SHAPE, NodeShape.RECT);
//			appr.set(VisualPropertyType.NODE_WIDTH, FEATURE_NODE_WIDTH);
//			appr.set(VisualPropertyType.NODE_HEIGHT, FEATURE_NODE_HEIGHT);
			
//			//Node colors
//			Color stroke = new Color(0,0,0);
//			if(stroke != null) {
//				appr.set(VisualPropertyType.NODE_BORDER_COLOR, stroke);
//			}
//			Color fill = new Color(255,255,255);
//			if(fill != null) {
//				appr.set(VisualPropertyType.NODE_FILL_COLOR, fill);
//			}
			
		
	}
		
//	public String calculateNodeLabel(Node node, CyNetwork network) {
//		String feature_id = SpliceController.get_nodeId();
//		CyNode feature = Cytoscape.getCyNode(feature_id);
//		CyAttributes nodeAttribs = Cytoscape.getNodeAttributes();
//		if(feature != null) {
//			String label = nodeAttribs.getStringAttribute(feature_id, "label");
//			return label;
//		}
//		return null;
//	}
}
