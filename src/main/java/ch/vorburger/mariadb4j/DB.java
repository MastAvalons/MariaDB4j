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
 * MariaDB (mysql) Controller.
 * 
 * You need to give the path to a previously unpacked MariaDB (mysql), as well as your data directory, here.
 *   
 * @see EmbeddedDB
 * 
 * @author Michael Vorburger
 */
public class DB {

	protected final File basedir;
	protected final File datadir;
	
	public DB(File basedir, File datadir) {
		super();
		check(basedir, "basedir");
		this.basedir = basedir;
		check(datadir, "datadir");
		this.datadir = datadir;
	}

	public void installDB() {
		throw new UnsupportedOperationException();
	}
	
	public void check() {
		throw new UnsupportedOperationException();
	}
	
	public void start() {
		throw new UnsupportedOperationException();
	}
	
	public void stop() {
		throw new UnsupportedOperationException();
	}

	/**
	 * @throws IllegalStateException if not yet started and automatic port search is active 
	 * @return TCP/IP port
	 */
	public int getPort() throws IllegalStateException {
		// TODO automatically search free TCP/IP port
		throw new UnsupportedOperationException();
	}
	public void setPort(int port) {
		throw new UnsupportedOperationException();
	}
	
	protected void check(File dir, String name) {
		if (dir == null)
			throw new IllegalArgumentException(name + " == null");
		if (dir.getAbsolutePath().trim().length() == 0)
			throw new IllegalArgumentException(name + " is empty");
		if (!dir.isDirectory())
			throw new IllegalArgumentException(name + " is not a directory");
		if (!dir.canRead())
			throw new IllegalArgumentException(name + " can not be read");
	}
}