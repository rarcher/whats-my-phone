/*
 *  Copyright (C) 2017  Ryan Archer
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jaredrummler.android.device;

import android.os.Build;
/**
 * Stub replacement for the <code>DeviceName</code> class from the Gradle dependency
 * <code>com.jaredrummler:android-device-names</code>. This stub exists only for compatibility with Eclipse, and is not
 * used in production builds.
 */
public class DeviceName
{
    public static String getDeviceName()
    {
        return Build.MODEL;
    }
}
