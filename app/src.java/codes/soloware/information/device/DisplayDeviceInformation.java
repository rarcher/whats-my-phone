/*
 *  Copyright (C) 2017 Ryan Archer
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
package codes.soloware.information.device;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import com.jaredrummler.android.device.DeviceName;
/**
 * An <code>Activity</code> that displays information about the device it is running on.
 */
public class DisplayDeviceInformation extends Activity
{
    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_device_information);

        ((TextView)super.findViewById(R.id.manufacturer)).setText(Build.MANUFACTURER);
        ((TextView)super.findViewById(R.id.model_name)).setText(DeviceName.getDeviceName());
        ((TextView)super.findViewById(R.id.model_number)).setText(Build.MODEL);
        ((TextView)super.findViewById(R.id.serial_number)).setText(Build.SERIAL);
    }
}
