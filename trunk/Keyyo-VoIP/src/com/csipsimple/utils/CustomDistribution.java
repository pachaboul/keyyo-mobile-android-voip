/**
 * Copyright (C) 2010 Regis Montoya (aka r3gis - www.r3gis.fr)
 * This file is part of CSipSimple.
 *
 *  CSipSimple is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  CSipSimple is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CSipSimple.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.csipsimple.utils;

import java.util.Locale;

import com.csipsimple.wizards.WizardUtils.WizardInfo;
import com.csipsimple.wizards.impl.Keyyo;
import com.keyyomobile.android.voip.R;

public class CustomDistribution {
	
	//Keyyo distribution

	public static boolean distributionWantsOtherAccounts() {
		return true;
	}
	
	public static boolean distributionWantsOtherProviders() {
		return false;
	}
	
	public static String getSupportEmail() {
		return "apps-support@keyyomobile.com";
	}
	
	public static String getUserAgent() {
		return "keyyo-voip-android";
	}
	
	public static WizardInfo getCustomDistributionWizard() {
		 return new WizardInfo("KEYYO", "Keyyo", 
				R.drawable.ic_wizard_keyyo, 9, 
				new Locale[]{Locale.FRANCE}, false, false, 
				Keyyo.class);
		 
	}
	
	public static String getRootPackage() {
		return "com.keyyomobile.android.voip";
	}
	
	public static boolean showIssueList() {
		return false;
	}
	
	public static String getFaqLink() {
		return "http://www.keyyomobile.com/voip/faq.htm";
	}
	
	public static boolean showFirstSettingScreen() {
		return false;
	}
	
	public static boolean supportMessaging() {
		return true;
	}

	public static boolean forceNoMultipleCalls() {
		return false;
	}
	
}
