
package Tsukeyithan.Packet;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.NetHandler;
import net.minecraft.src.Packet;

public class Packet138ReloadPlayerList extends Packet
{		
        public Packet138ReloadPlayerList()
        {
        }

        public Packet138ReloadPlayerList(int playerID, int skillID, int skillDuration)
        {
        }

        public void readPacketData(DataInputStream datainputstream) throws IOException
        {
        	int i = datainputstream.readInt();
        	String j = this.readString(datainputstream, 66);
        }

        public void writePacketData(DataOutputStream dataoutputstream) throws IOException
        {
        }

        public void processPacket(NetHandler nethandler)
        {
                nethandler.handleReloadPlayerList(this);
        }

        public int getPacketSize()
        {
                return 16;
        }
}