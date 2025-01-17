/*--
 $Id: SwingTagLibrary.java,v 1.1 2004/03/01 07:56:07 wolfpaulus Exp $

 Copyright (C) 2003-2007 Wolf Paulus.
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1. Redistributions of source code must retain the above copyright
 notice, this list of conditions, and the following disclaimer.

 2. Redistributions in binary form must reproduce the above copyright
 notice, this list of conditions, and the disclaimer that follows
 these conditions in the documentation and/or other materials provided
 with the distribution.

 3. The end-user documentation included with the redistribution,
 if any, must include the following acknowledgment:
        "This product includes software developed by the
         SWIXML Project (http://www.swixml.org/)."
 Alternately, this acknowledgment may appear in the software itself,
 if and wherever such third-party acknowledgments normally appear.

 4. The name "Swixml" must not be used to endorse or promote products
 derived from this software without prior written permission. For
 written permission, please contact <info_AT_swixml_DOT_org>

 5. Products derived from this software may not be called "Swixml",
 nor may "Swixml" appear in their name, without prior written
 permission from the Swixml Project Management.

 THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED.  IN NO EVENT SHALL THE SWIXML PROJECT OR ITS
 CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 SUCH DAMAGE.
 ====================================================================

 This software consists of voluntary contributions made by many
 individuals on behalf of the Swixml Project and was originally
 created by Wolf Paulus <wolf_AT_swixml_DOT_org>. For more information
 on the Swixml Project, please see <http://www.swixml.org/>.
*/
package org.swixml;

import org.swixml.custom.CustomMenuItem;

import javax.swing.*;
import javax.swing.table.JTableHeader;

/**
 * The SwingTagLibrary contains Factories for all Swing Objects that can be instatiated by
 * parsing an XML descriptor at runtime.
 *
 * Date: Dec 9, 2002
 *
 * @author <a href="mailto:wolf@wolfpaulus.com">Wolf Paulus</a>
 * @version $Revision: 1.1 $
 * @see org.swixml.TagLibrary

 */
public final class SwingTagLibrary extends TagLibrary {

  private static SwingTagLibrary INSTANCE = new SwingTagLibrary();
  public static SwingTagLibrary getInstance() {
    return SwingTagLibrary.INSTANCE;
  }

  /**
   * Constructs a Swing Library by registering swings widgets
   */
  private SwingTagLibrary() {
    registerTags();
  }

  /**
   * Registers the tags this TagLibrary is all about.
   * Strategy method called by the super class, allowing
   * derived classes to change the registration behaviour.
   */
  protected void registerTags() {
    registerTag( "Applet", JApplet.class );
    registerTag( "Button", JButton.class );
    registerTag( "ButtonGroup", ButtonGroup.class );
    registerTag( "HBox", XHBox.class );
    registerTag( "VBox", XVBox.class );
    registerTag( "Checkbox", JCheckBox.class );
    registerTag( "CheckBoxMenuItem", JCheckBoxMenuItem.class );
    registerTag( "ComboBox", JComboBox.class );
    registerTag( "Component", JComponent.class );
    registerTag( "DesktopPane", JDesktopPane.class );
    registerTag( "Dialog", XDialog.class );
    registerTag( "EditorPane", JEditorPane.class );
    registerTag( "FormattedTextField", JFormattedTextField.class );
    registerTag( "Frame",JFrame.class);
    registerTag( "Glue", XGlue.class );
    registerTag( "GridBagConstraints", XGridBagConstraints.class );
    registerTag( "InternalFrame", JInternalFrame.class );
    registerTag( "Label", JLabel.class );
    registerTag( "List", JList.class );
    registerTag( "Menu", JMenu.class );
    registerTag( "Menubar", JMenuBar.class );
    registerTag( "Menuitem", JMenuItem.class );
    registerTag( "CustomMenuitem", CustomMenuItem.class );
    registerTag( "Panel", JPanel.class );
    registerTag( "PasswordField", JPasswordField.class );
    registerTag( "PopupMenu", JPopupMenu.class );
    registerTag( "ProgressBar", JProgressBar.class );
    registerTag( "RadioButton", JRadioButton.class );
    registerTag( "RadioButtonMenuItem", JRadioButtonMenuItem.class );
    registerTag( "OptionPane", JOptionPane.class );
    registerTag( "ScrollPane", XScrollPane.class );
    registerTag( "Separator", JSeparator.class );
    registerTag( "Slider", JSlider.class );
    registerTag( "Spinner", JSpinner.class );
    registerTag( "SplitPane", XSplitPane.class );
    registerTag( "TabbedPane", XTabbedPane.class );
    registerTag( "Table", JTable.class );
    registerTag( "TableHeader", JTableHeader.class );
    registerTag( "TextArea", JTextArea.class );
    registerTag( "TextField", JTextField.class );
    registerTag( "TextPane", JTextPane.class );
    registerTag( "TitledSeparator", XTitledSeparator.class );
    registerTag( "ToggleButton", JToggleButton.class );
    registerTag( "Tree", JTree.class );
    registerTag( "Toolbar", JToolBar.class );
  }
}

