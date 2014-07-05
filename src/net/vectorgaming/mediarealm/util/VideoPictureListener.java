/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.vectorgaming.mediarealm.util;

import com.xuggle.mediatool.IMediaListener;
import com.xuggle.mediatool.MediaToolAdapter;
import com.xuggle.mediatool.event.IAddStreamEvent;
import com.xuggle.mediatool.event.IAudioSamplesEvent;
import com.xuggle.mediatool.event.ICloseCoderEvent;
import com.xuggle.mediatool.event.ICloseEvent;
import com.xuggle.mediatool.event.IFlushEvent;
import com.xuggle.mediatool.event.IOpenCoderEvent;
import com.xuggle.mediatool.event.IOpenEvent;
import com.xuggle.mediatool.event.IReadPacketEvent;
import com.xuggle.mediatool.event.IVideoPictureEvent;
import com.xuggle.mediatool.event.IWriteHeaderEvent;
import com.xuggle.mediatool.event.IWritePacketEvent;
import com.xuggle.mediatool.event.IWriteTrailerEvent;
import com.xuggle.xuggler.IVideoPicture;
import java.awt.image.BufferedImage;

/**
 *
 * @author XSoloDoloX
 */
class VideoPictureListener extends MediaToolAdapter
{

    @Override
    public void onVideoPicture(IVideoPictureEvent event)
    {
        super.onVideoPicture(event);
        if (event.getTimeStamp() == 1000)
        {
            IVideoPicture pict = event.getMediaData();  // get the VideoPicture
            BufferedImage image = event.getImage();   // get the image
        }
    }


}
