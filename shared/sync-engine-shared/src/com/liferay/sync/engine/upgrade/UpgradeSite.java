/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sync.engine.upgrade;

import com.liferay.sync.engine.service.SiteService;
import com.liferay.sync.engine.service.persistence.SitePersistence;

/**
 * @author Shinn Lok
 */
public class UpgradeSite extends UpgradeProcess {

	@Override
	public void upgrade() throws Exception {
		SitePersistence sitePersistence = SiteService.getSitePersistence();

		if (!sitePersistence.isTableExists()) {
			sitePersistence.createTable();
		}
	}

}