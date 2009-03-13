/*******************************************************************************
 * Copyright (c) 2009 The Eclipse Foundation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    The Eclipse Foundation - initial API and implementation
 *******************************************************************************/
package org.eclipse.examples.slideshow.ui.editors;

import java.net.URL;

import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;

public interface ISlideshowSourceProvider {

	String getSource();
	
	ITextSelection getSelection();

	void addTextListener(ITextListener listener);

	void removeTextListener(ITextListener listener);

	void addPostSelectionChangedListener(ISelectionChangedListener listener);

	void removePostSelectionChangedListener(ISelectionChangedListener listener);

	URL getBaseUrl();

}
