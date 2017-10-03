package com.bitsa.language_ngn;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.language.UTF8Control;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

@Component(
		 property = { "language.id=pl_PL" }, 
		 service = ResourceBundle.class
          )
public class CustomLanguagePL extends ResourceBundle 
{
	
ResourceBundle bundle = ResourceBundle.getBundle("content.Language_pl", UTF8Control.INSTANCE);
private Log _log = LogFactoryUtil.getLog(CustomLanguagePL.class);

	@Override
	protected Object handleGetObject(String key) 
        {
		_log.info("Reading key: " + key + ", value: " + bundle.getObject(key) + ", from " + bundle.getBaseBundleName());
		return bundle.getObject(key);
	}

	@Override
	public Enumeration<String> getKeys() 
        {
		return bundle.getKeys();
	}

}
