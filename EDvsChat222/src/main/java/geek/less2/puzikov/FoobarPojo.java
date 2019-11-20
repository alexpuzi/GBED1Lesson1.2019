package geek.less2.puzikov;/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is the maven-archetype-har.
 *
 * The Initial Developer of the Original Code is
 * the Vermont Department of Taxes.
 * Portions created by the Initial Developer are Copyright (C) 2007
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Tom Cort <tom.cort@state.vt.us>
 *
 * ***** END LICENSE BLOCK ***** */

import java.io.Serializable;
import java.util.Date;

/**
 * Dummy POJO used for testing.
 */
public class FoobarPojo implements Serializable {

	/**
	 * Version UID for Serialization
	 */
	private static final long serialVersionUID = 1;

	/**
	 * Identity is generated by DB.  From 0-BIGINT.
	 */
	private Long identity = 0L;

	/**
	 * Date the object was created
	 */
	private java.util.Date timestamp = new java.util.Date();

    public static void main(String[] args) {

    }

}
