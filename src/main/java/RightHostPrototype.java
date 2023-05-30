/*
 * Freehost3270 - A web deployment system for TN3270 clients
 *
 * Copyright (C) 1998,2001 Art Gillespie
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * The Author can be contacted at agillesp@i-no.com or
 * 185 Captain Whitney Road (Becket)
 * Chester, MA  01011
 */

import java.applet.Applet;
import java.awt.*;

        
class aboutFrame extends Frame
{
    aboutFrame()
    {
        super("About");
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add("North", new Label("RightHost 3270, (c)1998", Label.CENTER));
        add("Center", new Label("Licensed to the CIT Group", Label.CENTER));
        Panel p = new Panel();
        p.setLayout(new FlowLayout());
        p.add(new Button("OK"));
        add("South", p);
        resize(200, 200);
        Dimension screen_size, dlg;
        screen_size = Toolkit.getDefaultToolkit().getScreenSize();
        dlg = this.size();
        move((screen_size.width - dlg.width)/2, (screen_size.height - dlg.height)/2);
        show();
    }
    public boolean action(Event evt, Object arg)
    {
        if(evt.target instanceof Button)
            dispose();
        return true;
    }
}
        