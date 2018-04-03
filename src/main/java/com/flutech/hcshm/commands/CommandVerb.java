/**
 * ngx-distributed-shm
 * Copyright (C) 2018  Flu.Tech
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.flutech.hcshm.commands;

/**
 * The known Command Verbs
 */
public enum CommandVerb {
    /**
     * The GET command
     */
    GET,
    /**
     * The SET command
     */
    SET,
    /**
     * The TOUCH command
     */
    TOUCH,
    /**
     * The INCR command
     */
    INCR,
    /**
     * The Quit Command
     */
    QUIT,
    /**
     * The Delete Command
     */
    DELETE,
    /**
     * Unknown Command
     */
    UNKNOWN
}