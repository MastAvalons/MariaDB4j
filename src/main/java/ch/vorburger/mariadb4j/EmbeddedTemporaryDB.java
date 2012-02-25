/*
 * Copyright (c) 2012 Michael Vorburger
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * See also http://www.apache.org/licenses/LICENSE-2.0.html for an
 * explanation of the license and how it is applied.
 */
package ch.vorburger.mariadb4j;

import java.io.File;

/**
 * Embedded Temporary MariaDB (mysql), useful e.g. for integration tests.
 * 
 * You don't need to give the path to your data directory here, as it
 * automatically picks a temporary data directory (and it automatically unpacks
 * a MariaDB (mysql) to a temporary basedir if needed).
 * 
 * @author Michael Vorburger
 */
public class EmbeddedTemporaryDB extends EmbeddedDB {

	private boolean deleteOnExit = true;
	
	public EmbeddedTemporaryDB() {
		super(tempDataDir());
	}

	protected EmbeddedTemporaryDB(File datadir) {
		super(datadir);
	}

	protected static File tempDataDir() {
		// TODO Implement deleteOnExit 
		throw new UnsupportedOperationException();
	}

	public boolean isDeleteOnExit() {
		return deleteOnExit;
	}

	public void setDeleteOnExit(boolean deleteOnExit) {
		this.deleteOnExit = deleteOnExit;
	}

}