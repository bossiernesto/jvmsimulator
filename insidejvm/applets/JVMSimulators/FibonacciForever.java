/*
* Copyright (c) 1996, 1997 Bill Venners. All Rights Reserved.
*
* This Java source file is part of the Interactive Illustrations Web
* Site, which is delivered in the applets directory of the CD-ROM
* that accompanies the book "Inside the Java Virtual Machine" by Bill
* Venners, published by McGraw-Hill, 1997,ISBN: 0-07-913248-0. This
* source file is provided for evaluation purposes only, but you can
* redistribute it under certain conditions, described in the full
* copyright notice below.
*
* Full Copyright Notice:
*
* All the web pages and Java applets delivered in the applets
* directory of the CD-ROM, consisting of ".html," ".gif," ".class,"
* and ".java" files, are copyrighted (c) 1996, 1997 by Bill
* Venners, and all rights are reserved.  This material may be copied
* and placed on any commercial or non-commercial web server on any
* network (including the internet) provided that the following
* guidelines are followed:
*
* a. All the web pages and Java Applets (".html," ".gif," ".class,"
* and ".java" files), including the source code, that are delivered
* in the applets directory of the CD-ROM that
* accompanies the book must be published together on the same web
* site.
*
* b. All the web pages and Java Applets (".html," ".gif," ".class,"
* and ".java" files) must be published "as is" and may not be altered
* in any way.
*
* c. All use and access to this web site must be free, and no fees
* can be charged to view these materials, unless express written
* permission is obtained from Bill Venners.
*
* d. The web pages and Java Applets may not be distributed on any
* media, other than a web server on a network, and may not accompany
* any book or publication.
*
* BILL VENNERS MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
* SUITABILITY OF THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING
* BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR PARTICULAR PURPOSE, OR NON-INFRINGEMENT.  BILL VENNERS
* SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY A LICENSEE AS A
* RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
* DERIVATIVES.
*/
import java.awt.*;
import COM.artima.jvmsim.*;

/**
* This class is the personality module for the Fibonacci Forever
* simulation applet.
*
* @author  Bill Venners
*/
public class FibonacciForever extends JVMSimulator {

    private final static String appletTitle = "FIBONACCI FOREVER";

    private static final Color appletBackgroundColor = Color.blue;
    private static final Color registersAreaColor = Color.magenta;
    private static final Color stackAreaColor = Color.magenta;
    private static final Color methodAreaColor = Color.magenta;
    private static final Color titleColor = Color.cyan;
    private static final Color explanationLabelColor = Color.cyan;

    private static final int bytecodeViewSize = 13;
    private static final int maxStack = 4;
    private static final int maxLocals = 6;

    private static int[] theProgram = {
        OpCode.LCONST_1,
        OpCode.LSTORE_0,
        OpCode.LCONST_1,
        OpCode.LSTORE_2,
        OpCode.LCONST_1,
        OpCode.LSTORE, 4,
        OpCode.LLOAD_0,
        OpCode.LLOAD_2,
        OpCode.LADD,
        OpCode.LSTORE, 4,
        OpCode.LLOAD_2,
        OpCode.LSTORE_0,
        OpCode.LLOAD, 4,
        OpCode.LSTORE_2,
        OpCode.GOTO, (byte) 0xff, (byte) 0xf6
    };

    private static String[] bytecodeMnemonics = {
        "lconst_1",
        "lstore_0",
        "lconst_1",
        "lstore_2",
        "lconst_1",
        "lstore 4", "",
        "lload_0",
        "lload_2",
        "ladd",
        "lstore 4", "",
        "lload_2",
        "lstore_0",
        "lload 4", "",
        "lstore_2",
        "goto 7", "", ""
    };

    public int[] getTheProgram() {
        return theProgram;
    }
    public int getBytecodeViewSize() {
        return bytecodeViewSize;
    }
    public int getMaxStack() {
        return maxStack;
    }
    public int getMaxLocals() {
        return maxLocals;
    }
    public Color getMethodAreaColor() {
        return methodAreaColor;
    }
    public Color getStackAreaColor() {
        return stackAreaColor;
    }
    public Color getExplanationLabelColor() {
        return explanationLabelColor;
    }
    public Color getTitleColor() {
        return titleColor;
    }
    public Color getAppletBackgroundColor() {
        return appletBackgroundColor;
    }
    public String getAppletTitle() {
        return appletTitle;
    }
    public String[] getBytecodeMnemonics() {
        return bytecodeMnemonics;
    }
}
