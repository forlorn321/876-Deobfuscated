package com.jagex;

import com.jagex.Class107;
import com.jagex.Class167_Sub1;
import com.jagex.Class254;
import com.jagex.Class302;
import com.jagex.Class595;
import com.jagex.ColourUtils;

public class Class117 {

   Class167_Sub1 aClass167_Sub1_1433;
   boolean aBool1434 = true;
   boolean aBool1435 = false;
   int anInt1436 = 0;
   int anInt1437 = 0;
   boolean aBool1438 = false;
   float aFloat1439;
   int anInt1440;
   int anInt1441;
   float aFloat1442;
   float aFloat1443 = 0.0F;
   float aFloat1444 = 0.0F;
   float aFloat1445 = 1.0F;
   int[] anIntArray1446 = new int[4096];
   Class595 aClass595_1447;
   Class107 aClass107_1448;
   boolean aBool1449 = false;
   int anInt1450 = 0;
   int[] anIntArray1451;
   float[] aFloatArray1452;
   int anInt1453;
   int anInt1454 = -1;
   int[] anIntArray1455 = null;
   int anInt1456 = 0;
   int anInt1457 = 0;
   float aFloat1458 = 0.0F;
   float aFloat1459;
   int anInt1460;
   boolean aBool1461 = true;
   float aFloat1462;
   int[] anIntArray1463 = null;
   int anInt1464 = 0;
   int anInt1465 = 0;
   float aFloat1466 = 0.0F;
   int anInt1467 = -1;
   int[] anIntArray1468 = null;
   int anInt1469 = -1;
   int anInt1470 = 0;
   boolean aBool1471 = false;


   final void method1487(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15) {
      if(!var1) {
         this.method1507(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(this.aBool1471) {
         this.aClass167_Sub1_1433.method2060((int)var7, (int)var4, (int)var8, (int)var5, ColourUtils.anIntArray8308[(int)var13 & '\uffff'], 254834806);
         this.aClass167_Sub1_1433.method2060((int)var8, (int)var5, (int)var9, (int)var6, ColourUtils.anIntArray8308[(int)var13 & '\uffff'], -728274460);
         this.aClass167_Sub1_1433.method2060((int)var9, (int)var6, (int)var7, (int)var4, ColourUtils.anIntArray8308[(int)var13 & '\uffff'], -572652471);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var14 - var13;
         float var21 = var15 - var13;
         float var22 = var11 - var10;
         float var23 = var12 - var10;
         float var24;
         if(var6 != var5) {
            var24 = (var9 - var8) / (var6 - var5);
         } else {
            var24 = 0.0F;
         }

         float var25;
         if(var5 != var4) {
            var25 = var16 / var17;
         } else {
            var25 = 0.0F;
         }

         float var26;
         if(var6 != var4) {
            var26 = var18 / var19;
         } else {
            var26 = 0.0F;
         }

         float var27 = var16 * var19 - var18 * var17;
         if(var27 != 0.0F) {
            float var28 = (var20 * var19 - var21 * var17) / var27;
            float var29 = (var21 * var16 - var20 * var18) / var27;
            float var30 = (var22 * var19 - var23 * var17) / var27;
            float var31 = (var23 * var16 - var22 * var18) / var27;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)this.anInt1460) {
                  if(var5 > (float)this.anInt1460) {
                     var5 = (float)this.anInt1460;
                  }

                  if(var6 > (float)this.anInt1460) {
                     var6 = (float)this.anInt1460;
                  }

                  var13 = var13 - var28 * var7 + var28;
                  var10 = var10 - var30 * var7 + var30;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var24 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var26 >= var25) && (var4 != var5 || var26 <= var24)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var8, (int)var9, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)this.anInt1440;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var9, (int)var8, var13, var28, var10, var30);
                           var9 += var26;
                           var8 += var24;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)this.anInt1440;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var26 * var4;
                        var7 -= var25 * var4;
                        var13 -= var29 * var4;
                        var10 -= var31 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var24 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var26 >= var25) && (var4 != var6 || var24 <= var25)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var7, (int)var8, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var7, (int)var9, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)this.anInt1440;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var8, (int)var7, var13, var28, var10, var30);
                           var8 += var26;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                        }

                        while(--var5 >= 0.0F) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var9, (int)var7, var13, var28, var10, var30);
                           var9 += var24;
                           var7 += var25;
                           var13 += var29;
                           var10 += var31;
                           var4 += (float)this.anInt1440;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)this.anInt1460) {
                  if(var6 > (float)this.anInt1460) {
                     var6 = (float)this.anInt1460;
                  }

                  if(var4 > (float)this.anInt1460) {
                     var4 = (float)this.anInt1460;
                  }

                  var14 = var14 - var28 * var8 + var28;
                  var11 = var11 - var30 * var8 + var30;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var26 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var25 >= var24) && (var5 != var6 || var25 <= var26)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var9, (int)var7, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)this.anInt1440;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var4 >= 0.0F) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var7, (int)var9, var14, var28, var11, var30);
                           var7 += var25;
                           var9 += var26;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)this.anInt1440;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var25 * var5;
                        var8 -= var24 * var5;
                        var14 -= var29 * var5;
                        var11 -= var31 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var26 * var4;
                        var4 = 0.0F;
                     }

                     if(var25 < var24) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var9, (int)var8, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var7, (int)var8, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)this.anInt1440;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var8, (int)var9, var14, var28, var11, var30);
                           var9 += var25;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1488(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var8, (int)var7, var14, var28, var11, var30);
                           var7 += var26;
                           var8 += var24;
                           var14 += var29;
                           var11 += var31;
                           var5 += (float)this.anInt1440;
                        }

                     }
                  }
               }
            } else if(var6 < (float)this.anInt1460) {
               if(var4 > (float)this.anInt1460) {
                  var4 = (float)this.anInt1460;
               }

               if(var5 > (float)this.anInt1460) {
                  var5 = (float)this.anInt1460;
               }

               var15 = var15 - var28 * var9 + var28;
               var12 = var12 - var30 * var9 + var30;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var25 * var4;
                     var4 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1488(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        this.method1488(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var8, (int)var7, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)this.anInt1440;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1488(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var5 >= 0.0F) {
                        this.method1488(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var7, (int)var8, var15, var28, var12, var30);
                        var8 += var24;
                        var7 += var25;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)this.anInt1440;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var24 * var6;
                     var9 -= var26 * var6;
                     var15 -= var29 * var6;
                     var12 -= var31 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var25 * var5;
                     var5 = 0.0F;
                  }

                  if(var24 < var26) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1488(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var7, (int)var9, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        this.method1488(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var8, (int)var9, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)this.anInt1440;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1488(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var9, (int)var7, var15, var28, var12, var30);
                        var7 += var24;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                     }

                     while(--var4 >= 0.0F) {
                        this.method1488(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var9, (int)var8, var15, var28, var12, var30);
                        var8 += var25;
                        var9 += var26;
                        var15 += var29;
                        var12 += var31;
                        var6 += (float)this.anInt1440;
                     }

                  }
               }
            }
         }
      }
   }

   final void method1488(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12) {
      if(this.aBool1449) {
         if(var8 > this.anInt1441) {
            var8 = this.anInt1441;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         var4 += var7 - 1;
         var9 += var10 * (float)var7;
         var11 += var12 * (float)var7;
         int var13;
         int var14;
         int var15;
         if(this.aClass107_1448.aBool1285) {
            if(this.aBool1434) {
               var6 = var8 - var7 >> 2;
               var10 *= 4.0F;
               if(this.anInt1436 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                        var9 += var10;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];

                     do {
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  var13 = this.anInt1436;
                  var14 = 256 - this.anInt1436;
                  if(var6 > 0) {
                     do {
                        var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                        var9 += var10;
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var11 < this.aFloatArray1452[var4]) {
                           var15 = var3[var4];
                           if(var2) {
                              var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray1452[var4] = var11;
                           }
                        }

                        var11 += var12;
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(this.anInt1436 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var3[var4] = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                        if(var1) {
                           this.aFloatArray1452[var4] = var11;
                        }
                     }

                     var11 += var12;
                     var9 += var10;
                     --var6;
                  } while(var6 > 0);
               } else {
                  var13 = this.anInt1436;
                  var14 = 256 - this.anInt1436;

                  do {
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                        var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }

                        if(var1) {
                           this.aFloatArray1452[var4] = var11;
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else if(this.aBool1434) {
            var6 = var8 - var7 >> 2;
            var10 *= 4.0F;
            if(this.anInt1436 == 0) {
               if(var6 > 0) {
                  do {
                     var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                     var9 += var10;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];

                  do {
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var3[var4] = var5;
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            } else {
               var13 = this.anInt1436;
               var14 = 256 - this.anInt1436;
               if(var6 > 0) {
                  do {
                     var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                     var9 += var10;
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }

               var6 = var8 - var7 & 3;
               if(var6 > 0) {
                  var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                  var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');

                  do {
                     ++var4;
                     if(!var1 || var11 < this.aFloatArray1452[var4]) {
                        var15 = var3[var4];
                        if(var2) {
                           var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                        }
                     }

                     var11 += var12;
                     --var6;
                  } while(var6 > 0);
               }
            }
         } else {
            var6 = var8 - var7;
            if(this.anInt1436 == 0) {
               do {
                  ++var4;
                  if(!var1 || var11 < this.aFloatArray1452[var4]) {
                     var3[var4] = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                  }

                  var11 += var12;
                  var9 += var10;
                  --var6;
               } while(var6 > 0);
            } else {
               var13 = this.anInt1436;
               var14 = 256 - this.anInt1436;

               do {
                  ++var4;
                  if(!var1 || var11 < this.aFloatArray1452[var4]) {
                     var5 = ColourUtils.anIntArray8308[(int)var9 & '\uffff'];
                     var5 = ((var5 & 16711935) * var14 >> 8 & 16711935) + ((var5 & '\uff00') * var14 >> 8 & '\uff00');
                     var15 = var3[var4];
                     if(var2) {
                        var3[var4] = (var14 | var15 >> 24) << 24 | var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     } else {
                        var3[var4] = var5 + ((var15 & 16711935) * var13 >> 8 & 16711935) + ((var15 & '\uff00') * var13 >> 8 & '\uff00');
                     }
                  }

                  var9 += var10;
                  var11 += var12;
                  --var6;
               } while(var6 > 0);
            }
         }

      }
   }

   final void method1489(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16) {
      if(this.aBool1449) {
         if(var8 > this.anInt1441) {
            var8 = this.anInt1441;
         }

         if(var7 < 0) {
            var7 = 0;
         }
      }

      if(var7 < var8) {
         int var17;
         int var18;
         int var19;
         int var20;
         int var21;
         int var22;
         if(this.aBool1438) {
            var4 += var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(this.aBool1434) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(this.anInt1436 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var3[var4++] = var5;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!this.aBool1435) {
                  var17 = this.anInt1436;
                  var18 = 256 - this.anInt1436;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           var19 = var3[var4];
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }

                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        var21 = var4++;
                        int var23 = var3[var21];
                        int var24 = var5 + var23;
                        int var25 = (var5 & 16711935) + (var23 & 16711935);
                        var23 = (var25 & 16777472) + (var24 - var25 & 65536);
                        var3[var21] = -16777216 | var24 - var23 | var23 - (var23 >>> 8);
                        var24 = var4++;
                        int var26 = var3[var24];
                        int var27 = var5 + var26;
                        int var28 = (var5 & 16711935) + (var26 & 16711935);
                        var26 = (var28 & 16777472) + (var27 - var28 & 65536);
                        var3[var24] = -16777216 | var27 - var26 | var26 - (var26 >>> 8);
                        var27 = var4++;
                        int var29 = var3[var27];
                        int var30 = var5 + var29;
                        int var31 = (var5 & 16711935) + (var29 & 16711935);
                        var29 = (var31 & 16777472) + (var30 - var31 & 65536);
                        var3[var27] = -16777216 | var30 - var29 | var29 - (var29 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        var18 = var4++;
                        var20 = var3[var18];
                        var21 = var5 + var20;
                        var22 = (var5 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        --var6;
                     } while(var6 > 0);
                  }
               }
            } else {
               var6 = var8 - var7;
               if(this.anInt1436 == 0) {
                  do {
                     var3[var4++] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!this.aBool1435) {
                  var17 = this.anInt1436;
                  var18 = 256 - this.anInt1436;

                  do {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                     var19 = var3[var4];
                     if(var2) {
                        var3[var4++] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     } else {
                        var3[var4++] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                     }

                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     var18 = var4++;
                     var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var20 = var3[var18];
                     var21 = var19 + var20;
                     var22 = (var19 & 16711935) + (var20 & 16711935);
                     var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                     var3[var18] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }
            }

         } else {
            var4 += var7 - 1;
            var9 += var10 * (float)var7;
            var11 += var12 * (float)var7;
            var13 += var14 * (float)var7;
            var15 += var16 * (float)var7;
            if(this.aClass107_1448.aBool1285) {
               if(this.aBool1434) {
                  var6 = var8 - var7 >> 2;
                  var12 *= 4.0F;
                  var14 *= 4.0F;
                  var16 *= 4.0F;
                  if(this.anInt1436 == 0) {
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var3[var4] = var5;
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else if(!this.aBool1435) {
                     var17 = this.anInt1436;
                     var18 = 256 - this.anInt1436;
                     if(var6 > 0) {
                        do {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                        do {
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var19 = var3[var4];
                              if(var2) {
                                 var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              } else {
                                 var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                              }

                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  } else {
                     if(var6 > 0) {
                        do {
                           var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var11 += var12;
                           var13 += var14;
                           var15 += var16;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }

                     var6 = var8 - var7 & 3;
                     if(var6 > 0) {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                        do {
                           ++var4;
                           if(!var1 || var9 < this.aFloatArray1452[var4]) {
                              var20 = var3[var4];
                              var21 = var5 + var20;
                              var22 = (var5 & 16711935) + (var20 & 16711935);
                              var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                              var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                              if(var1) {
                                 this.aFloatArray1452[var4] = var9;
                              }
                           }

                           var9 += var10;
                           --var6;
                        } while(var6 > 0);
                     }
                  }

               } else {
                  var6 = var8 - var7;
                  if(this.anInt1436 == 0) {
                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           if(var1) {
                              this.aFloatArray1452[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else if(!this.aBool1435) {
                     var17 = this.anInt1436;
                     var18 = 256 - this.anInt1436;

                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }

                           if(var1) {
                              this.aFloatArray1452[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  } else {
                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                           var20 = var3[var4];
                           var21 = var19 + var20;
                           var22 = (var19 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                           if(var1) {
                              this.aFloatArray1452[var4] = var9;
                           }
                        }

                        var9 += var10;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        --var6;
                     } while(var6 > 0);
                  }

               }
            } else if(this.aBool1434) {
               var6 = var8 - var7 >> 2;
               var12 *= 4.0F;
               var14 *= 4.0F;
               var16 *= 4.0F;
               if(this.anInt1436 == 0) {
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var3[var4] = var5;
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else if(!this.aBool1435) {
                  var17 = this.anInt1436;
                  var18 = 256 - this.anInt1436;
                  if(var6 > 0) {
                     do {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');

                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var19 = var3[var4];
                           if(var2) {
                              var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           } else {
                              var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                           }
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               } else {
                  if(var6 > 0) {
                     do {
                        var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var11 += var12;
                        var13 += var14;
                        var15 += var16;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }

                  var6 = var8 - var7 & 3;
                  if(var6 > 0) {
                     var5 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;

                     do {
                        ++var4;
                        if(!var1 || var9 < this.aFloatArray1452[var4]) {
                           var20 = var3[var4];
                           var21 = var5 + var20;
                           var22 = (var5 & 16711935) + (var20 & 16711935);
                           var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                           var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                        }

                        var9 += var10;
                        --var6;
                     } while(var6 > 0);
                  }
               }

            } else {
               var6 = var8 - var7;
               if(this.anInt1436 == 0) {
                  do {
                     ++var4;
                     if(!var1 || var9 < this.aFloatArray1452[var4]) {
                        var3[var4] = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else if(!this.aBool1435) {
                  var17 = this.anInt1436;
                  var18 = 256 - this.anInt1436;

                  do {
                     ++var4;
                     if(!var1 || var9 < this.aFloatArray1452[var4]) {
                        var5 = -16777216 | (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var5 = ((var5 & 16711935) * var18 >> 8 & 16711935) + ((var5 & '\uff00') * var18 >> 8 & '\uff00');
                        var19 = var3[var4];
                        if(var2) {
                           var3[var4] = (var18 | var19 >> 24) << 24 | var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        } else {
                           var3[var4] = var5 + ((var19 & 16711935) * var17 >> 8 & 16711935) + ((var19 & '\uff00') * var17 >> 8 & '\uff00');
                        }
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               } else {
                  do {
                     ++var4;
                     if(!var1 || var9 < this.aFloatArray1452[var4]) {
                        var19 = (int)var11 & 16711680 | (int)var13 & '\uff00' | (int)var15 & 255;
                        var20 = var3[var4];
                        var21 = var19 + var20;
                        var22 = (var19 & 16711935) + (var20 & 16711935);
                        var20 = (var22 & 16777472) + (var21 - var22 & 65536);
                        var3[var4] = -16777216 | var21 - var20 | var20 - (var20 >>> 8);
                     }

                     var9 += var10;
                     var11 += var12;
                     var13 += var14;
                     var15 += var16;
                     --var6;
                  } while(var6 > 0);
               }

            }
         }
      }
   }

   int method1490() {
      return this.anIntArray1446[0] % this.anInt1440;
   }

   final void method1491(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29) {
      if(!var1) {
         this.method1507(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         int var30 = var29 & '\uffff';
         int var32;
         if(var30 != this.anInt1454) {
            this.anIntArray1455 = this.aClass167_Sub1_1433.method8444(var30);
            if(this.anIntArray1455 == null) {
               this.anInt1454 = -1;
               this.anInt1436 = 255 - (var22 >> 24 & 255);
               this.anInt1465 = 0;
               int var75 = ColourUtils.anIntArray8308[Class254.method3537(this.aClass167_Sub1_1433.method8448(var29), 1409175155) & '\uffff'];
               var32 = -16777216 | (var22 >> 16 & 255) * (var75 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var75 >> 8 & 255) & '\uff00' | (var22 & 255) * (var75 & 255) >> 8;
               this.method1504(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class302.method4097(var32, var25, var26, -1825552150), Class302.method4097(var32, var25, var27, -1283859155), Class302.method4097(var32, var25, var28, -1826985262));
               return;
            }

            this.anInt1454 = var30;
            this.anInt1456 = this.aClass167_Sub1_1433.method8446(var29);
            this.anInt1457 = this.anInt1456 - 1;
            this.aClass595_1447 = this.aClass167_Sub1_1433.method8465(var29);
            this.aBool1461 = this.aClass167_Sub1_1433.method8449(var29);
            this.anInt1465 = this.aClass167_Sub1_1433.method8447(var29) & 255;
         }

         this.anInt1453 = var25;
         float var31;
         if(var4 > var5 || var4 > var6) {
            if(var5 <= var6) {
               var31 = var7;
               var7 = var8;
               var8 = var31;
               var31 = var4;
               var4 = var5;
               var5 = var31;
               var31 = var10;
               var10 = var11;
               var11 = var31;
               var31 = var16;
               var16 = var17;
               var17 = var31;
               var31 = var19;
               var19 = var20;
               var20 = var31;
               var31 = var13;
               var13 = var14;
               var14 = var31;
               var31 = var26;
               var26 = var27;
               var27 = var31;
               var32 = var22;
               var22 = var23;
               var23 = var32;
            } else {
               var31 = var7;
               var7 = var9;
               var9 = var31;
               var31 = var4;
               var4 = var6;
               var6 = var31;
               var31 = var10;
               var10 = var12;
               var12 = var31;
               var31 = var16;
               var16 = var18;
               var18 = var31;
               var31 = var19;
               var19 = var21;
               var21 = var31;
               var31 = var13;
               var13 = var15;
               var15 = var31;
               var31 = var26;
               var26 = var28;
               var28 = var31;
               var32 = var22;
               var22 = var24;
               var24 = var32;
            }
         }

         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         var31 = (float)(var22 >> 24 & 255);
         float var74 = (float)(var23 >> 24 & 255);
         float var33 = (float)(var24 >> 24 & 255);
         float var34 = (float)(var22 >> 16 & 255);
         float var35 = (float)(var23 >> 16 & 255);
         float var36 = (float)(var24 >> 16 & 255);
         float var37 = (float)(var22 >> 8 & 255);
         float var38 = (float)(var23 >> 8 & 255);
         float var39 = (float)(var24 >> 8 & 255);
         float var40 = (float)(var22 & 255);
         float var41 = (float)(var23 & 255);
         float var42 = (float)(var24 & 255);
         float var43 = 0.0F;
         float var44 = 0.0F;
         float var45 = 0.0F;
         float var46 = 0.0F;
         float var47 = 0.0F;
         float var48 = 0.0F;
         float var49 = 0.0F;
         float var50 = 0.0F;
         float var51 = 0.0F;
         float var52 = 0.0F;
         float var53;
         if(var5 != var4) {
            var53 = var5 - var4;
            var43 = (var8 - var7) / var53;
            var44 = (var11 - var10) / var53;
            var45 = (var14 - var13) / var53;
            var46 = (var17 - var16) / var53;
            var47 = (var20 - var19) / var53;
            var48 = (var27 - var26) / var53;
            var49 = (var74 - var31) / var53;
            var50 = (var35 - var34) / var53;
            var51 = (var38 - var37) / var53;
            var52 = (var41 - var40) / var53;
         }

         var53 = 0.0F;
         float var54 = 0.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 0.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63;
         if(var6 != var5) {
            var63 = var6 - var5;
            var53 = (var9 - var8) / var63;
            var54 = (var12 - var11) / var63;
            var55 = (var15 - var14) / var63;
            var56 = (var18 - var17) / var63;
            var57 = (var21 - var20) / var63;
            var58 = (var28 - var27) / var63;
            var59 = (var33 - var74) / var63;
            var60 = (var36 - var35) / var63;
            var61 = (var39 - var38) / var63;
            var62 = (var42 - var41) / var63;
         }

         var63 = 0.0F;
         float var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71 = 0.0F;
         float var72 = 0.0F;
         if(var4 != var6) {
            float var73 = var4 - var6;
            var63 = (var7 - var9) / var73;
            var64 = (var10 - var12) / var73;
            var65 = (var13 - var15) / var73;
            var66 = (var16 - var18) / var73;
            var67 = (var19 - var21) / var73;
            var68 = (var26 - var28) / var73;
            var69 = (var31 - var33) / var73;
            var70 = (var34 - var36) / var73;
            var71 = (var37 - var39) / var73;
            var72 = (var40 - var42) / var73;
         }

         if(var4 < (float)this.anInt1460) {
            if(var5 > (float)this.anInt1460) {
               var5 = (float)this.anInt1460;
            }

            if(var6 > (float)this.anInt1460) {
               var6 = (float)this.anInt1460;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var33 = var31;
               var36 = var34;
               var39 = var37;
               var42 = var40;
               if(var4 < 0.0F) {
                  var7 -= var43 * var4;
                  var9 -= var63 * var4;
                  var10 -= var44 * var4;
                  var12 -= var64 * var4;
                  var13 -= var45 * var4;
                  var15 -= var65 * var4;
                  var16 -= var46 * var4;
                  var18 -= var66 * var4;
                  var19 -= var47 * var4;
                  var21 -= var67 * var4;
                  var26 -= var48 * var4;
                  var28 -= var68 * var4;
                  var31 -= var49 * var4;
                  var33 -= var69 * var4;
                  var34 -= var49 * var4;
                  var36 -= var69 * var4;
                  var37 -= var49 * var4;
                  var39 -= var69 * var4;
                  var40 -= var49 * var4;
                  var42 -= var69 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var53 * var5;
                  var11 -= var54 * var5;
                  var14 -= var55 * var5;
                  var17 -= var56 * var5;
                  var20 -= var57 * var5;
                  var27 -= var58 * var5;
                  var74 -= var59 * var5;
                  var35 -= var60 * var5;
                  var38 -= var61 * var5;
                  var41 -= var62 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var63 >= var43) && (var4 != var5 || var63 <= var53)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                     this.method1492(var2, var3, this.anIntArray1451, this.anIntArray1455, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var31, var33, var34, var36, var37, var39, var40, var42);
                     var7 += var43;
                     var9 += var63;
                     var10 += var44;
                     var12 += var64;
                     var13 += var45;
                     var15 += var65;
                     var16 += var46;
                     var18 += var66;
                     var19 += var47;
                     var21 += var67;
                     var26 += var48;
                     var28 += var68;
                     var31 += var49;
                     var33 += var69;
                     var34 += var50;
                     var36 += var70;
                     var37 += var51;
                     var39 += var71;
                     var40 += var52;
                     var42 += var72;
                  }

                  while(--var6 >= 0.0F) {
                     this.method1492(var2, var3, this.anIntArray1451, this.anIntArray1455, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var74, var33, var35, var36, var38, var39, var41, var42);
                     var8 += var53;
                     var9 += var63;
                     var11 += var54;
                     var12 += var64;
                     var14 += var55;
                     var15 += var65;
                     var17 += var56;
                     var18 += var66;
                     var20 += var57;
                     var21 += var67;
                     var27 += var58;
                     var28 += var68;
                     var74 += var59;
                     var33 += var69;
                     var35 += var60;
                     var36 += var70;
                     var38 += var61;
                     var39 += var71;
                     var41 += var62;
                     var42 += var72;
                     var4 += (float)this.anInt1440;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                     this.method1492(var2, var3, this.anIntArray1451, this.anIntArray1455, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var33, var31, var36, var34, var39, var37, var42, var40);
                     var7 += var43;
                     var9 += var63;
                     var10 += var44;
                     var12 += var64;
                     var13 += var45;
                     var15 += var65;
                     var16 += var46;
                     var18 += var66;
                     var19 += var47;
                     var21 += var67;
                     var26 += var48;
                     var28 += var68;
                     var31 += var49;
                     var33 += var69;
                     var34 += var50;
                     var36 += var70;
                     var37 += var51;
                     var39 += var71;
                     var40 += var52;
                     var42 += var72;
                  }

                  while(--var6 >= 0.0F) {
                     this.method1492(var2, var3, this.anIntArray1451, this.anIntArray1455, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var33, var74, var36, var35, var39, var38, var42, var41);
                     var8 += var53;
                     var9 += var63;
                     var11 += var54;
                     var12 += var64;
                     var14 += var55;
                     var15 += var65;
                     var17 += var56;
                     var18 += var66;
                     var20 += var57;
                     var21 += var67;
                     var27 += var58;
                     var28 += var68;
                     var74 += var59;
                     var33 += var69;
                     var35 += var60;
                     var36 += var70;
                     var38 += var61;
                     var39 += var71;
                     var41 += var62;
                     var42 += var72;
                     var4 += (float)this.anInt1440;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var74 = var31;
               var35 = var34;
               var38 = var37;
               var41 = var40;
               if(var4 < 0.0F) {
                  var7 -= var43 * var4;
                  var8 -= var63 * var4;
                  var10 -= var44 * var4;
                  var11 -= var64 * var4;
                  var13 -= var45 * var4;
                  var14 -= var65 * var4;
                  var16 -= var46 * var4;
                  var17 -= var66 * var4;
                  var19 -= var47 * var4;
                  var20 -= var67 * var4;
                  var26 -= var48 * var4;
                  var27 -= var68 * var4;
                  var31 -= var49 * var4;
                  var74 -= var69 * var4;
                  var34 -= var49 * var4;
                  var35 -= var69 * var4;
                  var37 -= var49 * var4;
                  var38 -= var69 * var4;
                  var40 -= var49 * var4;
                  var41 -= var69 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var53 * var6;
                  var12 -= var54 * var6;
                  var15 -= var55 * var6;
                  var18 -= var56 * var6;
                  var21 -= var57 * var6;
                  var28 -= var58 * var6;
                  var33 -= var59 * var6;
                  var36 -= var60 * var6;
                  var39 -= var61 * var6;
                  var42 -= var62 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var63 >= var43) && (var4 != var6 || var53 <= var43)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                     this.method1492(var2, var3, this.anIntArray1451, this.anIntArray1455, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var31, var74, var34, var35, var37, var38, var40, var41);
                     var8 += var63;
                     var7 += var43;
                     var11 += var64;
                     var10 += var44;
                     var14 += var65;
                     var13 += var45;
                     var17 += var66;
                     var16 += var46;
                     var20 += var67;
                     var19 += var47;
                     var27 += var68;
                     var26 += var48;
                     var74 += var69;
                     var31 += var49;
                     var35 += var70;
                     var34 += var50;
                     var38 += var71;
                     var37 += var51;
                     var41 += var72;
                     var40 += var52;
                  }

                  while(--var5 >= 0.0F) {
                     this.method1492(var2, var3, this.anIntArray1451, this.anIntArray1455, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var31, var33, var34, var36, var37, var39, var40, var42);
                     var7 += var43;
                     var9 += var53;
                     var10 += var44;
                     var12 += var54;
                     var13 += var45;
                     var15 += var55;
                     var16 += var46;
                     var18 += var56;
                     var19 += var47;
                     var21 += var57;
                     var26 += var48;
                     var28 += var58;
                     var31 += var49;
                     var33 += var59;
                     var34 += var50;
                     var36 += var60;
                     var37 += var51;
                     var39 += var61;
                     var40 += var52;
                     var42 += var62;
                     var4 += (float)this.anInt1440;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                     this.method1492(var2, var3, this.anIntArray1451, this.anIntArray1455, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var74, var31, var35, var34, var38, var37, var41, var40);
                     var7 += var43;
                     var8 += var63;
                     var10 += var44;
                     var11 += var64;
                     var13 += var45;
                     var14 += var65;
                     var16 += var46;
                     var17 += var66;
                     var19 += var47;
                     var20 += var67;
                     var26 += var48;
                     var27 += var68;
                     var31 += var49;
                     var74 += var69;
                     var34 += var50;
                     var35 += var70;
                     var37 += var51;
                     var38 += var71;
                     var40 += var52;
                     var41 += var72;
                  }

                  while(--var5 >= 0.0F) {
                     this.method1492(var2, var3, this.anIntArray1451, this.anIntArray1455, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var33, var31, var36, var34, var39, var37, var42, var40);
                     var9 += var53;
                     var7 += var43;
                     var12 += var54;
                     var10 += var44;
                     var15 += var55;
                     var13 += var45;
                     var18 += var56;
                     var16 += var46;
                     var21 += var57;
                     var19 += var47;
                     var28 += var58;
                     var26 += var48;
                     var33 += var59;
                     var31 += var49;
                     var36 += var60;
                     var34 += var50;
                     var39 += var61;
                     var37 += var51;
                     var42 += var62;
                     var40 += var52;
                     var4 += (float)this.anInt1440;
                  }
               }
            }

         }
      }
   }

   final void method1492(boolean var1, boolean var2, int[] var3, int[] var4, int var5, int var6, int var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25) {
      int var26 = var7 - var6;
      float var27 = 1.0F / (float)var26;
      float var28 = (var9 - var8) * var27;
      float var29 = (var11 - var10) * var27;
      float var30 = (var13 - var12) * var27;
      float var31 = (var15 - var14) * var27;
      float var32 = (var17 - var16) * var27;
      float var33 = (var19 - var18) * var27;
      float var34 = (var21 - var20) * var27;
      float var35 = (var23 - var22) * var27;
      float var36 = (var25 - var24) * var27;
      if(this.aBool1449) {
         if(var7 > this.anInt1441) {
            var7 = this.anInt1441;
         }

         if(var6 < 0) {
            var8 -= var28 * (float)var6;
            var10 -= var29 * (float)var6;
            var12 -= var30 * (float)var6;
            var14 -= var31 * (float)var6;
            var16 -= var32 * (float)var6;
            var18 -= var33 * (float)var6;
            var20 -= var34 * (float)var6;
            var22 -= var35 * (float)var6;
            var24 -= var36 * (float)var6;
            var6 = 0;
         }
      }

      if(var6 < var7) {
         var26 = var7 - var6;

         for(var5 += var6; var26-- > 0; var24 += var36) {
            float var37 = 1.0F / var8;
            float var38 = 1.0F / var10;
            if(!var1 || var37 < this.aFloatArray1452[var5]) {
               int var39 = (int)(var12 * var38 * (float)this.anInt1456);
               if(this.aBool1461) {
                  var39 &= this.anInt1457;
               } else if(var39 < 0) {
                  var39 = 0;
               } else if(var39 > this.anInt1457) {
                  var39 = this.anInt1457;
               }

               int var40 = (int)(var14 * var38 * (float)this.anInt1456);
               if(this.aBool1461) {
                  var40 &= this.anInt1457;
               } else if(var40 < 0) {
                  var40 = 0;
               } else if(var40 > this.anInt1457) {
                  var40 = this.anInt1457;
               }

               int var41 = this.anIntArray1455[var40 * this.anInt1456 + var39];
               boolean var42 = true;
               int var46;
               if(this.aClass595_1447 == Class595.aClass595_7819) {
                  var46 = (int)((float)(var41 >> 24 & 255) * var18 / 255.0F);
               } else if(this.aClass595_1447 == Class595.aClass595_7818) {
                  if((var41 >> 24 & 255) > this.anInt1465) {
                     var46 = 255;
                  } else {
                     var46 = 0;
                  }
               } else {
                  var46 = (int)var18;
               }

               if(var46 != 0) {
                  int var43;
                  int var44;
                  int var45;
                  if(var46 != 255) {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((this.anInt1453 & 16711935) * (int)var16 & -16711936 | (this.anInt1453 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     var44 = var3[var5];
                     var45 = 255 - var46;
                     var43 = ((var44 & 16711935) * var45 + (var43 & 16711935) * var46 & -16711936) + ((var44 & '\uff00') * var45 + (var43 & '\uff00') * var46 & 16711680) >> 8;
                     if(var2) {
                        var3[var5] = (var46 | var3[var5] >> 24) << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        this.aFloatArray1452[var5] = var37;
                     }
                  } else {
                     var43 = -16777216 | (int)(var20 * (float)(var41 >> 16 & 255)) << 8 & 16711680 | (int)(var22 * (float)(var41 >> 8 & 255)) & '\uff00' | (int)(var24 * (float)(var41 & 255)) >> 8;
                     if(var16 != 0.0F) {
                        var44 = (int)(255.0F - var16);
                        var45 = ((this.anInt1453 & 16711935) * (int)var16 & -16711936 | (this.anInt1453 & '\uff00') * (int)var16 & 16711680) >>> 8;
                        var43 = (((var43 & 16711935) * var44 & -16711936 | (var43 & '\uff00') * var44 & 16711680) >>> 8) + var45;
                     }

                     if(var2) {
                        var3[var5] = var46 << 24 | var43;
                     } else {
                        var3[var5] = var43;
                     }

                     if(var1) {
                        this.aFloatArray1452[var5] = var37;
                     }
                  }
               }
            }

            ++var5;
            var8 += var28;
            var10 += var29;
            var12 += var30;
            var14 += var31;
            var16 += var32;
            var18 += var33;
            var20 += var34;
            var22 += var35;
         }

      }
   }

   final void method1493(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, int var22, int var23, int var24, int var25, float var26, float var27, float var28, int var29, float var30, int var31, float var32, int var33, float var34) {
      if(!var1) {
         this.method1507(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else {
         this.anInt1453 = var25;
         int var36;
         if(var4 > var5 || var4 > var6) {
            float var35;
            if(var5 <= var6) {
               var35 = var7;
               var7 = var8;
               var8 = var35;
               var35 = var4;
               var4 = var5;
               var5 = var35;
               var35 = var10;
               var10 = var11;
               var11 = var35;
               var35 = var16;
               var16 = var17;
               var17 = var35;
               var35 = var19;
               var19 = var20;
               var20 = var35;
               var35 = var13;
               var13 = var14;
               var14 = var35;
               var35 = var26;
               var26 = var27;
               var27 = var35;
               var35 = var30;
               var30 = var32;
               var32 = var35;
               var36 = var22;
               var22 = var23;
               var23 = var36;
               var36 = var29;
               var29 = var31;
               var31 = var36;
            } else {
               var35 = var7;
               var7 = var9;
               var9 = var35;
               var35 = var4;
               var4 = var6;
               var6 = var35;
               var35 = var10;
               var10 = var12;
               var12 = var35;
               var35 = var16;
               var16 = var18;
               var18 = var35;
               var35 = var19;
               var19 = var21;
               var21 = var35;
               var35 = var13;
               var13 = var15;
               var15 = var35;
               var35 = var26;
               var26 = var28;
               var28 = var35;
               var35 = var30;
               var30 = var34;
               var34 = var35;
               var36 = var22;
               var22 = var24;
               var24 = var36;
               var36 = var29;
               var29 = var33;
               var33 = var36;
            }
         }

         int var93 = var29 & '\uffff';
         var36 = var31 & '\uffff';
         int var37 = var33 & '\uffff';
         int var94;
         int var95;
         if(var93 != this.anInt1454) {
            this.anIntArray1455 = this.aClass167_Sub1_1433.method8444(var93);
            if(this.anIntArray1455 == null) {
               this.anInt1454 = -1;
               this.anInt1436 = 255 - (var22 >> 24 & 255);
               var94 = ColourUtils.anIntArray8308[Class254.method3537(this.aClass167_Sub1_1433.method8448(var29), 1409175155) & '\uffff'];
               var95 = -16777216 | (var22 >> 16 & 255) * (var94 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var94 >> 8 & 255) & '\uff00' | (var22 & 255) * (var94 & 255) >> 8;
               this.method1504(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class302.method4097(var95, var25, var26, -1142640288), Class302.method4097(var95, var25, var27, -1773539956), Class302.method4097(var95, var25, var28, -1716172052));
               return;
            }

            this.anInt1454 = var93;
            this.anInt1456 = this.aClass167_Sub1_1433.method8446(var29);
            this.anInt1457 = this.anInt1456 - 1;
            this.aClass595_1447 = this.aClass167_Sub1_1433.method8465(var29);
         }

         this.aFloat1458 = var30;
         if(var36 != this.anInt1469) {
            this.anIntArray1463 = this.aClass167_Sub1_1433.method8444(var36);
            if(this.anIntArray1463 == null) {
               this.anInt1469 = -1;
               this.anInt1436 = 255 - (var22 >> 24 & 255);
               var94 = ColourUtils.anIntArray8308[Class254.method3537(this.aClass167_Sub1_1433.method8448(var31), 1409175155) & '\uffff'];
               var95 = -16777216 | (var22 >> 16 & 255) * (var94 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var94 >> 8 & 255) & '\uff00' | (var22 & 255) * (var94 & 255) >> 8;
               this.method1504(true, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, Class302.method4097(var95, var25, var26, -840364423), Class302.method4097(var95, var25, var27, -2051263031), Class302.method4097(var95, var25, var28, -999460310));
               return;
            }

            this.anInt1469 = var36;
            this.anInt1464 = this.aClass167_Sub1_1433.method8446(var31);
            this.anInt1437 = this.anInt1464 - 1;
         }

         this.aFloat1466 = var32;
         if(var37 != this.anInt1467) {
            this.anIntArray1468 = this.aClass167_Sub1_1433.method8444(var37);
            if(this.anIntArray1468 == null) {
               this.anInt1467 = -1;
               this.anInt1436 = 255 - (var22 >> 24 & 255);
               var94 = ColourUtils.anIntArray8308[Class254.method3537(this.aClass167_Sub1_1433.method8448(var33), 1409175155) & '\uffff'];
               var95 = -16777216 | (var22 >> 16 & 255) * (var94 >> 16 & 255) << 8 & 16711680 | (var22 >> 8 & 255) * (var94 >> 8 & 255) & '\uff00' | (var22 & 255) * (var94 & 255) >> 8;
               this.method1504(true, var2, var3, (float)((int)var4), (float)((int)var5), (float)((int)var6), (float)((int)var7), (float)((int)var8), (float)((int)var9), (float)((int)var10), (float)((int)var11), (float)((int)var12), Class302.method4097(var95, var25, var26, -924498830), Class302.method4097(var95, var25, var27, -1813152191), Class302.method4097(var95, var25, var28, -1157509218));
               return;
            }

            this.anInt1467 = var37;
            this.anInt1450 = this.aClass167_Sub1_1433.method8446(var33);
            this.anInt1470 = this.anInt1450 - 1;
         }

         this.aFloat1443 = var34;
         var16 /= var13;
         var17 /= var14;
         var18 /= var15;
         var19 /= var13;
         var20 /= var14;
         var21 /= var15;
         var10 = 1.0F / var10;
         var11 = 1.0F / var11;
         var12 = 1.0F / var12;
         var13 = 1.0F / var13;
         var14 = 1.0F / var14;
         var15 = 1.0F / var15;
         float var38 = (float)(var22 >> 24 & 255);
         float var39 = (float)(var23 >> 24 & 255);
         float var40 = (float)(var24 >> 24 & 255);
         float var41 = (float)(var22 >> 16 & 255);
         float var42 = (float)(var23 >> 16 & 255);
         float var43 = (float)(var24 >> 16 & 255);
         float var44 = (float)(var22 >> 8 & 255);
         float var45 = (float)(var23 >> 8 & 255);
         float var46 = (float)(var24 >> 8 & 255);
         float var47 = (float)(var22 & 255);
         float var48 = (float)(var23 & 255);
         float var49 = (float)(var24 & 255);
         float var50 = 1.0F;
         float var51 = 0.0F;
         float var52 = 0.0F;
         float var53 = 0.0F;
         float var54 = 1.0F;
         float var55 = 0.0F;
         float var56 = 0.0F;
         float var57 = 0.0F;
         float var58 = 0.0F;
         float var59 = 0.0F;
         float var60 = 0.0F;
         float var61 = 0.0F;
         float var62 = 0.0F;
         float var63 = 0.0F;
         float var64 = 0.0F;
         float var65 = 0.0F;
         float var66 = 0.0F;
         float var67 = 0.0F;
         float var68;
         if(var5 != var4) {
            var68 = var5 - var4;
            var56 = (var8 - var7) / var68;
            var57 = (var11 - var10) / var68;
            var58 = (var14 - var13) / var68;
            var59 = (var17 - var16) / var68;
            var60 = (var20 - var19) / var68;
            var61 = (var27 - var26) / var68;
            var62 = (var39 - var38) / var68;
            var63 = (var42 - var41) / var68;
            var64 = (var45 - var44) / var68;
            var65 = (var48 - var47) / var68;
            var66 = (var51 - var50) / var68;
            var67 = (var54 - var53) / var68;
         }

         var68 = 0.0F;
         float var69 = 0.0F;
         float var70 = 0.0F;
         float var71 = 0.0F;
         float var72 = 0.0F;
         float var73 = 0.0F;
         float var74 = 0.0F;
         float var75 = 0.0F;
         float var76 = 0.0F;
         float var77 = 0.0F;
         float var78 = 0.0F;
         float var79 = 0.0F;
         float var80;
         if(var6 != var5) {
            var80 = var6 - var5;
            var68 = (var9 - var8) / var80;
            var69 = (var12 - var11) / var80;
            var70 = (var15 - var14) / var80;
            var71 = (var18 - var17) / var80;
            var72 = (var21 - var20) / var80;
            var73 = (var28 - var27) / var80;
            var74 = (var40 - var39) / var80;
            var75 = (var43 - var42) / var80;
            var76 = (var46 - var45) / var80;
            var77 = (var49 - var48) / var80;
            var78 = (var52 - var51) / var80;
            var79 = (var55 - var54) / var80;
         }

         var80 = 0.0F;
         float var81 = 0.0F;
         float var82 = 0.0F;
         float var83 = 0.0F;
         float var84 = 0.0F;
         float var85 = 0.0F;
         float var86 = 0.0F;
         float var87 = 0.0F;
         float var88 = 0.0F;
         float var89 = 0.0F;
         float var90 = 0.0F;
         float var91 = 0.0F;
         if(var4 != var6) {
            float var92 = var4 - var6;
            var80 = (var7 - var9) / var92;
            var81 = (var10 - var12) / var92;
            var82 = (var13 - var15) / var92;
            var83 = (var16 - var18) / var92;
            var84 = (var19 - var21) / var92;
            var85 = (var26 - var28) / var92;
            var86 = (var38 - var40) / var92;
            var87 = (var41 - var43) / var92;
            var88 = (var44 - var46) / var92;
            var89 = (var47 - var49) / var92;
            var90 = (var50 - var52) / var92;
            var91 = (var53 - var55) / var92;
         }

         if(var4 < (float)this.anInt1460) {
            if(var5 > (float)this.anInt1460) {
               var5 = (float)this.anInt1460;
            }

            if(var6 > (float)this.anInt1460) {
               var6 = (float)this.anInt1460;
            }

            if(var5 < var6) {
               var9 = var7;
               var12 = var10;
               var15 = var13;
               var18 = var16;
               var21 = var19;
               var28 = var26;
               var40 = var38;
               var43 = var41;
               var46 = var44;
               var49 = var47;
               var52 = var50;
               var55 = var53;
               if(var4 < 0.0F) {
                  var7 -= var56 * var4;
                  var9 -= var80 * var4;
                  var10 -= var57 * var4;
                  var12 -= var81 * var4;
                  var13 -= var58 * var4;
                  var15 -= var82 * var4;
                  var16 -= var59 * var4;
                  var18 -= var83 * var4;
                  var19 -= var60 * var4;
                  var21 -= var84 * var4;
                  var26 -= var61 * var4;
                  var28 -= var85 * var4;
                  var38 -= var62 * var4;
                  var40 -= var86 * var4;
                  var41 -= var63 * var4;
                  var43 -= var87 * var4;
                  var44 -= var64 * var4;
                  var46 -= var88 * var4;
                  var47 -= var65 * var4;
                  var49 -= var89 * var4;
                  var50 -= var66 * var4;
                  var52 -= var90 * var4;
                  var53 -= var67 * var4;
                  var55 -= var91 * var4;
                  var4 = 0.0F;
               }

               if(var5 < 0.0F) {
                  var8 -= var68 * var5;
                  var11 -= var69 * var5;
                  var14 -= var70 * var5;
                  var17 -= var71 * var5;
                  var20 -= var72 * var5;
                  var27 -= var73 * var5;
                  var39 -= var74 * var5;
                  var42 -= var75 * var5;
                  var45 -= var76 * var5;
                  var48 -= var77 * var5;
                  var51 -= var78 * var5;
                  var54 -= var79 * var5;
                  var5 = 0.0F;
               }

               if((var4 == var5 || var80 >= var56) && (var4 != var5 || var80 <= var68)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                     this.method1494(var2, var3, this.anIntArray1451, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var38, var40, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55);
                     var7 += var56;
                     var9 += var80;
                     var10 += var57;
                     var12 += var81;
                     var13 += var58;
                     var15 += var82;
                     var16 += var59;
                     var18 += var83;
                     var19 += var60;
                     var21 += var84;
                     var26 += var61;
                     var28 += var85;
                     var38 += var62;
                     var40 += var86;
                     var41 += var63;
                     var43 += var87;
                     var44 += var64;
                     var46 += var88;
                     var47 += var65;
                     var49 += var89;
                     var50 += var66;
                     var52 += var90;
                     var53 += var67;
                     var55 += var91;
                  }

                  while(--var6 >= 0.0F) {
                     this.method1494(var2, var3, this.anIntArray1451, (int)var4, (int)var8, (int)var9, var11, var12, var14, var15, var17, var18, var20, var21, var27, var28, var39, var40, var42, var43, var45, var46, var48, var49, var51, var52, var54, var55);
                     var8 += var68;
                     var9 += var80;
                     var11 += var69;
                     var12 += var81;
                     var14 += var70;
                     var15 += var82;
                     var17 += var71;
                     var18 += var83;
                     var20 += var72;
                     var21 += var84;
                     var27 += var73;
                     var28 += var85;
                     var39 += var74;
                     var40 += var86;
                     var42 += var75;
                     var43 += var87;
                     var45 += var76;
                     var46 += var88;
                     var48 += var77;
                     var49 += var89;
                     var51 += var78;
                     var52 += var90;
                     var54 += var79;
                     var55 += var91;
                     var4 += (float)this.anInt1440;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F)) - var5;
                  var5 -= var4;

                  for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                     this.method1494(var2, var3, this.anIntArray1451, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var40, var38, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53);
                     var7 += var56;
                     var9 += var80;
                     var10 += var57;
                     var12 += var81;
                     var13 += var58;
                     var15 += var82;
                     var16 += var59;
                     var18 += var83;
                     var19 += var60;
                     var21 += var84;
                     var26 += var61;
                     var28 += var85;
                     var38 += var62;
                     var40 += var86;
                     var41 += var63;
                     var43 += var87;
                     var44 += var64;
                     var46 += var88;
                     var47 += var65;
                     var49 += var89;
                     var50 += var66;
                     var52 += var90;
                     var53 += var67;
                     var55 += var91;
                  }

                  while(--var6 >= 0.0F) {
                     this.method1494(var2, var3, this.anIntArray1451, (int)var4, (int)var9, (int)var8, var12, var11, var15, var14, var18, var17, var21, var20, var28, var27, var40, var39, var43, var42, var46, var45, var49, var48, var52, var51, var55, var54);
                     var8 += var68;
                     var9 += var80;
                     var11 += var69;
                     var12 += var81;
                     var14 += var70;
                     var15 += var82;
                     var17 += var71;
                     var18 += var83;
                     var20 += var72;
                     var21 += var84;
                     var27 += var73;
                     var28 += var85;
                     var39 += var74;
                     var40 += var86;
                     var42 += var75;
                     var43 += var87;
                     var45 += var76;
                     var46 += var88;
                     var48 += var77;
                     var49 += var89;
                     var51 += var78;
                     var52 += var90;
                     var54 += var79;
                     var55 += var91;
                     var4 += (float)this.anInt1440;
                  }
               }
            } else {
               var8 = var7;
               var11 = var10;
               var14 = var13;
               var17 = var16;
               var20 = var19;
               var27 = var26;
               var39 = var38;
               var42 = var41;
               var45 = var44;
               var48 = var47;
               var51 = var50;
               var54 = var53;
               if(var4 < 0.0F) {
                  var7 -= var56 * var4;
                  var8 -= var80 * var4;
                  var10 -= var57 * var4;
                  var11 -= var81 * var4;
                  var13 -= var58 * var4;
                  var14 -= var82 * var4;
                  var16 -= var59 * var4;
                  var17 -= var83 * var4;
                  var19 -= var60 * var4;
                  var20 -= var84 * var4;
                  var26 -= var61 * var4;
                  var27 -= var85 * var4;
                  var38 -= var62 * var4;
                  var39 -= var86 * var4;
                  var41 -= var63 * var4;
                  var42 -= var87 * var4;
                  var44 -= var64 * var4;
                  var45 -= var88 * var4;
                  var47 -= var65 * var4;
                  var48 -= var89 * var4;
                  var50 -= var66 * var4;
                  var51 -= var90 * var4;
                  var53 -= var67 * var4;
                  var54 -= var91 * var4;
                  var4 = 0.0F;
               }

               if(var6 < 0.0F) {
                  var9 -= var68 * var6;
                  var12 -= var69 * var6;
                  var15 -= var70 * var6;
                  var18 -= var71 * var6;
                  var21 -= var72 * var6;
                  var28 -= var73 * var6;
                  var40 -= var74 * var6;
                  var43 -= var75 * var6;
                  var46 -= var76 * var6;
                  var49 -= var77 * var6;
                  var52 -= var78 * var6;
                  var55 -= var79 * var6;
                  var6 = 0.0F;
               }

               if((var4 == var6 || var80 >= var56) && (var4 != var6 || var68 <= var56)) {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                     this.method1494(var2, var3, this.anIntArray1451, (int)var4, (int)var7, (int)var8, var10, var11, var13, var14, var16, var17, var19, var20, var26, var27, var38, var39, var41, var42, var44, var45, var47, var48, var50, var51, var53, var54);
                     var8 += var80;
                     var7 += var56;
                     var11 += var81;
                     var10 += var57;
                     var14 += var82;
                     var13 += var58;
                     var17 += var83;
                     var16 += var59;
                     var20 += var84;
                     var19 += var60;
                     var27 += var85;
                     var26 += var61;
                     var39 += var86;
                     var38 += var62;
                     var42 += var87;
                     var41 += var63;
                     var45 += var88;
                     var44 += var64;
                     var48 += var89;
                     var47 += var65;
                     var51 += var90;
                     var50 += var66;
                     var54 += var91;
                     var53 += var67;
                  }

                  while(--var5 >= 0.0F) {
                     this.method1494(var2, var3, this.anIntArray1451, (int)var4, (int)var7, (int)var9, var10, var12, var13, var15, var16, var18, var19, var21, var26, var28, var38, var40, var41, var43, var44, var46, var47, var49, var50, var52, var53, var55);
                     var7 += var56;
                     var9 += var68;
                     var10 += var57;
                     var12 += var69;
                     var13 += var58;
                     var15 += var70;
                     var16 += var59;
                     var18 += var71;
                     var19 += var60;
                     var21 += var72;
                     var26 += var61;
                     var28 += var73;
                     var38 += var62;
                     var40 += var74;
                     var41 += var63;
                     var43 += var75;
                     var44 += var64;
                     var46 += var76;
                     var47 += var65;
                     var49 += var77;
                     var50 += var66;
                     var52 += var78;
                     var53 += var67;
                     var55 += var79;
                     var4 += (float)this.anInt1440;
                  }
               } else {
                  var4 = (float)((int)(var4 + 0.5F));
                  var6 = (float)((int)(var6 + 0.5F));
                  var5 = (float)((int)(var5 + 0.5F)) - var6;
                  var6 -= var4;

                  for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                     this.method1494(var2, var3, this.anIntArray1451, (int)var4, (int)var8, (int)var7, var11, var10, var14, var13, var17, var16, var20, var19, var27, var26, var39, var38, var42, var41, var45, var44, var48, var47, var51, var50, var54, var53);
                     var7 += var56;
                     var8 += var80;
                     var10 += var57;
                     var11 += var81;
                     var13 += var58;
                     var14 += var82;
                     var16 += var59;
                     var17 += var83;
                     var19 += var60;
                     var20 += var84;
                     var26 += var61;
                     var27 += var85;
                     var38 += var62;
                     var39 += var86;
                     var41 += var63;
                     var42 += var87;
                     var44 += var64;
                     var45 += var88;
                     var47 += var65;
                     var48 += var89;
                     var50 += var66;
                     var51 += var90;
                     var53 += var67;
                     var54 += var91;
                  }

                  while(--var5 >= 0.0F) {
                     this.method1494(var2, var3, this.anIntArray1451, (int)var4, (int)var9, (int)var7, var12, var10, var15, var13, var18, var16, var21, var19, var28, var26, var40, var38, var43, var41, var46, var44, var49, var47, var52, var50, var55, var53);
                     var9 += var68;
                     var7 += var56;
                     var12 += var69;
                     var10 += var57;
                     var15 += var70;
                     var13 += var58;
                     var18 += var71;
                     var16 += var59;
                     var21 += var72;
                     var19 += var60;
                     var28 += var73;
                     var26 += var61;
                     var40 += var74;
                     var38 += var62;
                     var43 += var75;
                     var41 += var63;
                     var46 += var76;
                     var44 += var64;
                     var49 += var77;
                     var47 += var65;
                     var52 += var78;
                     var50 += var66;
                     var55 += var79;
                     var53 += var67;
                     var4 += (float)this.anInt1440;
                  }
               }
            }

         }
      }
   }

   final void method1494(boolean var1, boolean var2, int[] var3, int var4, int var5, int var6, float var7, float var8, float var9, float var10, float var11, float var12, float var13, float var14, float var15, float var16, float var17, float var18, float var19, float var20, float var21, float var22, float var23, float var24, float var25, float var26, float var27, float var28) {
      int var29 = var6 - var5;
      float var30 = 1.0F / (float)var29;
      float var31 = (var8 - var7) * var30;
      float var32 = (var10 - var9) * var30;
      float var33 = (var12 - var11) * var30;
      float var34 = (var14 - var13) * var30;
      float var35 = (var16 - var15) * var30;
      float var36 = (var18 - var17) * var30;
      float var37 = (var20 - var19) * var30;
      float var38 = (var22 - var21) * var30;
      float var39 = (var24 - var23) * var30;
      float var40 = (var26 - var25) * var30;
      float var41 = (var28 - var27) * var30;
      if(this.aBool1449) {
         if(var6 > this.anInt1441) {
            var6 = this.anInt1441;
         }

         if(var5 < 0) {
            var7 -= var31 * (float)var5;
            var9 -= var32 * (float)var5;
            var11 -= var33 * (float)var5;
            var13 -= var34 * (float)var5;
            var15 -= var35 * (float)var5;
            var17 -= var36 * (float)var5;
            var19 -= var37 * (float)var5;
            var21 -= var38 * (float)var5;
            var23 -= var39 * (float)var5;
            var25 -= var40 * (float)var5;
            var27 -= var41 * (float)var5;
            var5 = 0;
         }
      }

      if(var5 < var6) {
         var29 = var6 - var5;

         for(var4 += var5; var29-- > 0; var27 += var41) {
            float var42 = 1.0F / var7;
            float var43 = 1.0F / var9;
            if(!var1 || var42 < this.aFloatArray1452[var4]) {
               float var44 = var11 * var43;
               float var45 = var13 * var43;
               int var46 = (int)(var44 * (float)this.anInt1456 * this.aFloat1458) & this.anInt1457;
               int var47 = (int)(var45 * (float)this.anInt1456 * this.aFloat1458) & this.anInt1457;
               int var48 = this.anIntArray1455[var47 * this.anInt1456 + var46];
               var46 = (int)(var44 * (float)this.anInt1464 * this.aFloat1466) & this.anInt1437;
               var47 = (int)(var45 * (float)this.anInt1464 * this.aFloat1466) & this.anInt1437;
               int var49 = this.anIntArray1463[var47 * this.anInt1464 + var46];
               var46 = (int)(var44 * (float)this.anInt1450 * this.aFloat1443) & this.anInt1470;
               var47 = (int)(var45 * (float)this.anInt1450 * this.aFloat1443) & this.anInt1470;
               int var50 = this.anIntArray1468[var47 * this.anInt1450 + var46];
               float var51 = 1.0F - (var25 + var27);
               var48 = -16777216 | (int)(var25 * (float)(var48 >> 16 & 255)) << 16 | (int)(var25 * (float)(var48 >> 8 & 255)) << 8 | (int)(var25 * (float)(var48 & 255));
               var49 = -16777216 | (int)(var27 * (float)(var49 >> 16 & 255)) << 16 | (int)(var27 * (float)(var49 >> 8 & 255)) << 8 | (int)(var27 * (float)(var49 & 255));
               var50 = -16777216 | (int)(var51 * (float)(var50 >> 16 & 255)) << 16 | (int)(var51 * (float)(var50 >> 8 & 255)) << 8 | (int)(var51 * (float)(var50 & 255));
               int var52 = var48 + var49 + var50;
               int var53 = -16777216 | (int)(var19 * (float)(var52 >> 16 & 255)) << 8 & 16711680 | (int)(var21 * (float)(var52 >> 8 & 255)) & '\uff00' | (int)(var23 * (float)(var52 & 255)) >> 8;
               if(var15 != 0.0F) {
                  int var54 = (int)(255.0F - var15);
                  int var55 = ((this.anInt1453 & 16711935) * (int)var15 & -16711936 | (this.anInt1453 & '\uff00') * (int)var15 & 16711680) >>> 8;
                  var53 = (((var53 & 16711935) * var54 & -16711936 | (var53 & '\uff00') * var54 & 16711680) >>> 8) + var55;
               }

               if(var2) {
                  var3[var4] = ((int)var17 | var3[var4] >> 24) << 24 | var53;
               } else {
                  var3[var4] = var53;
               }

               if(var1) {
                  this.aFloatArray1452[var4] = var42;
               }
            }

            ++var4;
            var7 += var31;
            var9 += var32;
            var11 += var33;
            var13 += var34;
            var15 += var35;
            var17 += var36;
            var19 += var37;
            var21 += var38;
            var23 += var39;
            var25 += var40;
         }

      }
   }

   int method1495() {
      return this.anIntArray1446[0] % this.anInt1440;
   }

   int method1496() {
      return this.anIntArray1446[0] % this.anInt1440;
   }

   int method1497() {
      return this.anIntArray1446[0] % this.anInt1440;
   }

   int method1498() {
      return this.anIntArray1446[0] / this.anInt1440;
   }

   int method1499() {
      return this.anIntArray1446[0] / this.anInt1440;
   }

   int method1500() {
      return this.anIntArray1446[0] / this.anInt1440;
   }

   final void method1501(boolean var1) {
      this.aBool1471 = var1;
   }

   final void method1502(boolean var1) {
      this.aBool1471 = var1;
   }

   int method1503() {
      return this.anIntArray1446[0] / this.anInt1440;
   }

   final void method1504(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13, int var14, int var15) {
      if(!var1) {
         this.method1507(false, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, 0);
      } else if(this.aBool1471) {
         this.aClass167_Sub1_1433.method2060((int)var7, (int)var4, (int)var8, (int)var5, -16777216 | var13, -803382054);
         this.aClass167_Sub1_1433.method2060((int)var8, (int)var5, (int)var9, (int)var6, -16777216 | var13, -552328597);
         this.aClass167_Sub1_1433.method2060((int)var9, (int)var6, (int)var7, (int)var4, -16777216 | var13, -219967307);
      } else {
         float var16 = var8 - var7;
         float var17 = var5 - var4;
         float var18 = var9 - var7;
         float var19 = var6 - var4;
         float var20 = var11 - var10;
         float var21 = var12 - var10;
         float var22 = (float)((var14 & 16711680) - (var13 & 16711680));
         float var23 = (float)((var15 & 16711680) - (var13 & 16711680));
         float var24 = (float)((var14 & '\uff00') - (var13 & '\uff00'));
         float var25 = (float)((var15 & '\uff00') - (var13 & '\uff00'));
         float var26 = (float)((var14 & 255) - (var13 & 255));
         float var27 = (float)((var15 & 255) - (var13 & 255));
         float var28;
         if(var6 != var5) {
            var28 = (var9 - var8) / (var6 - var5);
         } else {
            var28 = 0.0F;
         }

         float var29;
         if(var5 != var4) {
            var29 = var16 / var17;
         } else {
            var29 = 0.0F;
         }

         float var30;
         if(var6 != var4) {
            var30 = var18 / var19;
         } else {
            var30 = 0.0F;
         }

         float var31 = var16 * var19 - var18 * var17;
         if(var31 != 0.0F) {
            float var32 = (var20 * var19 - var21 * var17) / var31;
            float var33 = (var21 * var16 - var20 * var18) / var31;
            float var34 = (var22 * var19 - var23 * var17) / var31;
            float var35 = (var23 * var16 - var22 * var18) / var31;
            float var36 = (var24 * var19 - var25 * var17) / var31;
            float var37 = (var25 * var16 - var24 * var18) / var31;
            float var38 = (var26 * var19 - var27 * var17) / var31;
            float var39 = (var27 * var16 - var26 * var18) / var31;
            float var40;
            float var41;
            float var42;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)this.anInt1460) {
                  if(var5 > (float)this.anInt1460) {
                     var5 = (float)this.anInt1460;
                  }

                  if(var6 > (float)this.anInt1460) {
                     var6 = (float)this.anInt1460;
                  }

                  var10 = var10 - var32 * var7 + var32;
                  var40 = (float)(var13 & 16711680) - var34 * var7 + var34;
                  var41 = (float)(var13 & '\uff00') - var36 * var7 + var36;
                  var42 = (float)(var13 & 255) - var38 * var7 + var38;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var28 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var30 >= var29) && (var4 != var5 || var30 <= var28)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var8, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)this.anInt1440;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var9, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var30;
                           var8 += var28;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)this.anInt1440;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var30 * var4;
                        var7 -= var29 * var4;
                        var10 -= var33 * var4;
                        var40 -= var35 * var4;
                        var41 -= var37 * var4;
                        var42 -= var39 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var28 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var30 >= var29) && (var4 != var6 || var28 <= var29)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var7, (int)var8, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var7, (int)var9, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)this.anInt1440;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var8, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var8 += var30;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var5 >= 0.0F) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var4, 0, 0, (int)var9, (int)var7, var10, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var28;
                           var7 += var29;
                           var10 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var4 += (float)this.anInt1440;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)this.anInt1460) {
                  if(var6 > (float)this.anInt1460) {
                     var6 = (float)this.anInt1460;
                  }

                  if(var4 > (float)this.anInt1460) {
                     var4 = (float)this.anInt1460;
                  }

                  var11 = var11 - var32 * var8 + var32;
                  var40 = (float)(var14 & 16711680) - var34 * var8 + var34;
                  var41 = (float)(var14 & '\uff00') - var36 * var8 + var36;
                  var42 = (float)(var14 & 255) - var38 * var8 + var38;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var30 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var29 >= var28) && (var5 != var6 || var29 <= var30)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var9, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)this.anInt1440;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var4 >= 0.0F) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var7, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var29;
                           var9 += var30;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)this.anInt1440;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var29 * var5;
                        var8 -= var28 * var5;
                        var11 -= var33 * var5;
                        var40 -= var35 * var5;
                        var41 -= var37 * var5;
                        var42 -= var39 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var30 * var4;
                        var4 = 0.0F;
                     }

                     if(var29 < var28) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var9, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var7, (int)var8, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)this.anInt1440;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var8, (int)var9, var11, var32, var40, var34, var41, var36, var42, var38);
                           var9 += var29;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1489(var2, var3, this.anIntArray1451, (int)var5, 0, 0, (int)var8, (int)var7, var11, var32, var40, var34, var41, var36, var42, var38);
                           var7 += var30;
                           var8 += var28;
                           var11 += var33;
                           var40 += var35;
                           var41 += var37;
                           var42 += var39;
                           var5 += (float)this.anInt1440;
                        }

                     }
                  }
               }
            } else if(var6 < (float)this.anInt1460) {
               if(var4 > (float)this.anInt1460) {
                  var4 = (float)this.anInt1460;
               }

               if(var5 > (float)this.anInt1460) {
                  var5 = (float)this.anInt1460;
               }

               var12 = var12 - var32 * var9 + var32;
               var40 = (float)(var15 & 16711680) - var34 * var9 + var34;
               var41 = (float)(var15 & '\uff00') - var36 * var9 + var36;
               var42 = (float)(var15 & 255) - var38 * var9 + var38;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var29 * var4;
                     var4 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1489(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        this.method1489(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var8, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)this.anInt1440;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1489(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var5 >= 0.0F) {
                        this.method1489(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var7, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var28;
                        var7 += var29;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)this.anInt1440;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var28 * var6;
                     var9 -= var30 * var6;
                     var12 -= var33 * var6;
                     var40 -= var35 * var6;
                     var41 -= var37 * var6;
                     var42 -= var39 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var29 * var5;
                     var5 = 0.0F;
                  }

                  if(var28 < var30) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1489(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var7, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        this.method1489(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var8, (int)var9, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)this.anInt1440;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1489(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var9, (int)var7, var12, var32, var40, var34, var41, var36, var42, var38);
                        var7 += var28;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                     }

                     while(--var4 >= 0.0F) {
                        this.method1489(var2, var3, this.anIntArray1451, (int)var6, 0, 0, (int)var9, (int)var8, var12, var32, var40, var34, var41, var36, var42, var38);
                        var8 += var29;
                        var9 += var30;
                        var12 += var33;
                        var40 += var35;
                        var41 += var37;
                        var42 += var39;
                        var6 += (float)this.anInt1440;
                     }

                  }
               }
            }
         }
      }
   }

   final void method1505(boolean var1) {
      this.aBool1471 = var1;
   }

   final void method1506(boolean var1, boolean var2, boolean var3, int[] var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11) {
      if(this.aBool1449) {
         if(var9 > this.anInt1441) {
            var9 = this.anInt1441;
         }

         if(var8 < 0) {
            var8 = 0;
         }
      }

      if(var8 < var9) {
         var5 += var8 - 1;
         var7 = var9 - var8 >> 2;
         var10 += var11 * (float)var8;
         int var12;
         int var13;
         int var14;
         if(this.aClass107_1448.aBool1285) {
            if(this.anInt1436 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < this.aFloatArray1452[var5]) {
                           if(var1) {
                              var4[var5] = var6;
                           }

                           if(var2) {
                              this.aFloatArray1452[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        this.aFloatArray1452[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        this.aFloatArray1452[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        this.aFloatArray1452[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     if(var1) {
                        var4[var5] = var6;
                     }

                     if(var2) {
                        this.aFloatArray1452[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            } else if(this.anInt1436 == 254) {
               if(var8 != 0 && var9 <= this.anInt1441 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if((!var2 || var10 < this.aFloatArray1452[var5]) && var1) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if((!var2 || var10 < this.aFloatArray1452[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < this.aFloatArray1452[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < this.aFloatArray1452[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if((!var2 || var10 < this.aFloatArray1452[var5]) && var1) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = this.anInt1436;
               var13 = 256 - this.anInt1436;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < this.aFloatArray1452[var5]) {
                           if(var1) {
                              var14 = var4[var5];
                              if(var3) {
                                 var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              } else {
                                 var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                              }
                           }

                           if(var2) {
                              this.aFloatArray1452[var5] = var10;
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        this.aFloatArray1452[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        this.aFloatArray1452[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        this.aFloatArray1452[var5] = var10;
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     if(var1) {
                        var14 = var4[var5];
                        if(var3) {
                           var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        } else {
                           var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                        }
                     }

                     if(var2) {
                        this.aFloatArray1452[var5] = var10;
                     }
                  }

                  var10 += var11;
               }
            }
         } else if(var1) {
            if(this.anInt1436 == 0) {
               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < this.aFloatArray1452[var5]) {
                           var4[var5] = var6;
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     var4[var5] = var6;
                  }

                  var10 += var11;
               }
            } else if(this.anInt1436 == 254) {
               if(var8 != 0 && var9 <= this.anInt1441 - 1) {
                  while(true) {
                     --var7;
                     if(var7 < 0) {
                        var7 = var9 - var8 & 3;

                        while(true) {
                           --var7;
                           if(var7 < 0) {
                              return;
                           }

                           ++var5;
                           if(!var2 || var10 < this.aFloatArray1452[var5]) {
                              var4[var5 - 1] = var4[var5];
                           }

                           var10 += var11;
                        }
                     }

                     ++var5;
                     if(!var2 || var10 < this.aFloatArray1452[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < this.aFloatArray1452[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < this.aFloatArray1452[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                     ++var5;
                     if(!var2 || var10 < this.aFloatArray1452[var5]) {
                        var4[var5 - 1] = var4[var5];
                     }

                     var10 += var11;
                  }
               }
            } else {
               var12 = this.anInt1436;
               var13 = 256 - this.anInt1436;
               var6 = ((var6 & 16711935) * var13 >> 8 & 16711935) + ((var6 & '\uff00') * var13 >> 8 & '\uff00');

               while(true) {
                  --var7;
                  if(var7 < 0) {
                     var7 = var9 - var8 & 3;

                     while(true) {
                        --var7;
                        if(var7 < 0) {
                           return;
                        }

                        ++var5;
                        if(!var2 || var10 < this.aFloatArray1452[var5]) {
                           var14 = var4[var5];
                           if(var3) {
                              var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           } else {
                              var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                           }
                        }

                        var10 += var11;
                     }
                  }

                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
                  ++var5;
                  if(!var2 || var10 < this.aFloatArray1452[var5]) {
                     var14 = var4[var5];
                     if(var3) {
                        var4[var5] = (var13 | var14 >> 24) << 24 | var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     } else {
                        var4[var5] = var6 + ((var14 & 16711935) * var12 >> 8 & 16711935) + ((var14 & '\uff00') * var12 >> 8 & '\uff00');
                     }
                  }

                  var10 += var11;
               }
            }
         }
      }
   }

   Class117(Class167_Sub1 var1, Class107 var2) {
      this.aClass167_Sub1_1433 = var1;
      this.aClass107_1448 = var2;
      this.anInt1440 = this.aClass167_Sub1_1433.anInt8997 * -570111553;
      this.anIntArray1451 = this.aClass167_Sub1_1433.anIntArray8996;
      this.aFloatArray1452 = this.aClass167_Sub1_1433.aFloatArray8999;
      this.aClass595_1447 = Class595.aClass595_7820;
   }

   final void method1507(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, float var11, float var12, int var13) {
      if(this.aBool1471) {
         this.aClass167_Sub1_1433.method2060((int)var7, (int)var4, (int)var8, (int)var5, var13, 326316031);
         this.aClass167_Sub1_1433.method2060((int)var8, (int)var5, (int)var9, (int)var6, var13, -20461226);
         this.aClass167_Sub1_1433.method2060((int)var9, (int)var6, (int)var7, (int)var4, var13, 634675725);
      } else {
         float var14 = var8 - var7;
         float var15 = var5 - var4;
         float var16 = var9 - var7;
         float var17 = var6 - var4;
         float var18 = var11 - var10;
         float var19 = var12 - var10;
         float var20 = 0.0F;
         if(var5 != var4) {
            var20 = (var8 - var7) / (var5 - var4);
         }

         float var21 = 0.0F;
         if(var6 != var5) {
            var21 = (var9 - var8) / (var6 - var5);
         }

         float var22 = 0.0F;
         if(var6 != var4) {
            var22 = (var7 - var9) / (var4 - var6);
         }

         float var23 = var14 * var17 - var16 * var15;
         if(var23 != 0.0F) {
            float var24 = (var18 * var17 - var19 * var15) / var23;
            float var25 = (var19 * var14 - var18 * var16) / var23;
            if(var4 <= var5 && var4 <= var6) {
               if(var4 < (float)this.anInt1460) {
                  if(var5 > (float)this.anInt1460) {
                     var5 = (float)this.anInt1460;
                  }

                  if(var6 > (float)this.anInt1460) {
                     var6 = (float)this.anInt1460;
                  }

                  var10 = var10 - var24 * var7 + var24;
                  if(var5 < var6) {
                     var9 = var7;
                     if(var4 < 0.0F) {
                        var9 = var7 - var22 * var4;
                        var7 -= var20 * var4;
                        var10 -= var25 * var4;
                        var4 = 0.0F;
                     }

                     if(var5 < 0.0F) {
                        var8 -= var21 * var5;
                        var5 = 0.0F;
                     }

                     if((var4 == var5 || var22 >= var20) && (var4 != var5 || var22 <= var21)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var4, var13, 0, (int)var7, (int)var9, var10, var24);
                           var9 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var4, var13, 0, (int)var8, (int)var9, var10, var24);
                           var9 += var22;
                           var8 += var21;
                           var10 += var25;
                           var4 += (float)this.anInt1440;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var5;
                        var5 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var5 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var4, var13, 0, (int)var9, (int)var7, var10, var24);
                           var9 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var4, var13, 0, (int)var9, (int)var8, var10, var24);
                           var9 += var22;
                           var8 += var21;
                           var10 += var25;
                           var4 += (float)this.anInt1440;
                        }

                     }
                  } else {
                     var8 = var7;
                     if(var4 < 0.0F) {
                        var8 = var7 - var22 * var4;
                        var7 -= var20 * var4;
                        var10 -= var25 * var4;
                        var4 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var21 * var6;
                        var6 = 0.0F;
                     }

                     if((var4 == var6 || var22 >= var20) && (var4 != var6 || var21 <= var20)) {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var4, var13, 0, (int)var7, (int)var8, var10, var24);
                           var8 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var5 >= 0.0F) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var4, var13, 0, (int)var7, (int)var9, var10, var24);
                           var9 += var21;
                           var7 += var20;
                           var10 += var25;
                           var4 += (float)this.anInt1440;
                        }

                     } else {
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var5 = (float)((int)(var5 + 0.5F)) - var6;
                        var6 -= var4;

                        for(var4 = (float)this.anIntArray1446[(int)var4]; --var6 >= 0.0F; var4 += (float)this.anInt1440) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var4, var13, 0, (int)var8, (int)var7, var10, var24);
                           var8 += var22;
                           var7 += var20;
                           var10 += var25;
                        }

                        while(--var5 >= 0.0F) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var4, var13, 0, (int)var9, (int)var7, var10, var24);
                           var9 += var21;
                           var7 += var20;
                           var10 += var25;
                           var4 += (float)this.anInt1440;
                        }

                     }
                  }
               }
            } else if(var5 <= var6) {
               if(var5 < (float)this.anInt1460) {
                  if(var6 > (float)this.anInt1460) {
                     var6 = (float)this.anInt1460;
                  }

                  if(var4 > (float)this.anInt1460) {
                     var4 = (float)this.anInt1460;
                  }

                  var11 = var11 - var24 * var8 + var24;
                  if(var6 < var4) {
                     var7 = var8;
                     if(var5 < 0.0F) {
                        var7 = var8 - var20 * var5;
                        var8 -= var21 * var5;
                        var11 -= var25 * var5;
                        var5 = 0.0F;
                     }

                     if(var6 < 0.0F) {
                        var9 -= var22 * var6;
                        var6 = 0.0F;
                     }

                     if((var5 == var6 || var20 >= var21) && (var5 != var6 || var20 <= var22)) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var5, var13, 0, (int)var8, (int)var7, var11, var24);
                           var7 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var4 >= 0.0F) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var5, var13, 0, (int)var9, (int)var7, var11, var24);
                           var7 += var20;
                           var9 += var22;
                           var11 += var25;
                           var5 += (float)this.anInt1440;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F)) - var6;
                        var6 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var6 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var5, var13, 0, (int)var7, (int)var8, var11, var24);
                           var7 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var4 >= 0.0F) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var5, var13, 0, (int)var7, (int)var9, var11, var24);
                           var7 += var20;
                           var9 += var22;
                           var11 += var25;
                           var5 += (float)this.anInt1440;
                        }

                     }
                  } else {
                     var9 = var8;
                     if(var5 < 0.0F) {
                        var9 = var8 - var20 * var5;
                        var8 -= var21 * var5;
                        var11 -= var25 * var5;
                        var5 = 0.0F;
                     }

                     if(var4 < 0.0F) {
                        var7 -= var22 * var4;
                        var4 = 0.0F;
                     }

                     if(var20 < var21) {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var5, var13, 0, (int)var9, (int)var8, var11, var24);
                           var9 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var5, var13, 0, (int)var7, (int)var8, var11, var24);
                           var7 += var22;
                           var8 += var21;
                           var11 += var25;
                           var5 += (float)this.anInt1440;
                        }

                     } else {
                        var5 = (float)((int)(var5 + 0.5F));
                        var4 = (float)((int)(var4 + 0.5F));
                        var6 = (float)((int)(var6 + 0.5F)) - var4;
                        var4 -= var5;

                        for(var5 = (float)this.anIntArray1446[(int)var5]; --var4 >= 0.0F; var5 += (float)this.anInt1440) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var5, var13, 0, (int)var8, (int)var9, var11, var24);
                           var9 += var20;
                           var8 += var21;
                           var11 += var25;
                        }

                        while(--var6 >= 0.0F) {
                           this.method1506(var1, var2, var3, this.anIntArray1451, (int)var5, var13, 0, (int)var8, (int)var7, var11, var24);
                           var7 += var22;
                           var8 += var21;
                           var11 += var25;
                           var5 += (float)this.anInt1440;
                        }

                     }
                  }
               }
            } else if(var6 < (float)this.anInt1460) {
               if(var4 > (float)this.anInt1460) {
                  var4 = (float)this.anInt1460;
               }

               if(var5 > (float)this.anInt1460) {
                  var5 = (float)this.anInt1460;
               }

               var12 = var12 - var24 * var9 + var24;
               if(var4 < var5) {
                  var8 = var9;
                  if(var6 < 0.0F) {
                     var8 = var9 - var21 * var6;
                     var9 -= var22 * var6;
                     var12 -= var25 * var6;
                     var6 = 0.0F;
                  }

                  if(var4 < 0.0F) {
                     var7 -= var20 * var4;
                     var4 = 0.0F;
                  }

                  if(var21 < var22) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1506(var1, var2, var3, this.anIntArray1451, (int)var6, var13, 0, (int)var8, (int)var9, var12, var24);
                        var8 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var5 >= 0.0F) {
                        this.method1506(var1, var2, var3, this.anIntArray1451, (int)var6, var13, 0, (int)var8, (int)var7, var12, var24);
                        var8 += var21;
                        var7 += var20;
                        var12 += var25;
                        var6 += (float)this.anInt1440;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F)) - var4;
                     var4 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var4 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1506(var1, var2, var3, this.anIntArray1451, (int)var6, var13, 0, (int)var9, (int)var8, var12, var24);
                        var8 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var5 >= 0.0F) {
                        this.method1506(var1, var2, var3, this.anIntArray1451, (int)var6, var13, 0, (int)var7, (int)var8, var12, var24);
                        var8 += var21;
                        var7 += var20;
                        var12 += var25;
                        var6 += (float)this.anInt1440;
                     }

                  }
               } else {
                  var7 = var9;
                  if(var6 < 0.0F) {
                     var7 = var9 - var21 * var6;
                     var9 -= var22 * var6;
                     var12 -= var25 * var6;
                     var6 = 0.0F;
                  }

                  if(var5 < 0.0F) {
                     var8 -= var20 * var5;
                     var5 = 0.0F;
                  }

                  if(var21 < var22) {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1506(var1, var2, var3, this.anIntArray1451, (int)var6, var13, 0, (int)var7, (int)var9, var12, var24);
                        var7 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var4 >= 0.0F) {
                        this.method1506(var1, var2, var3, this.anIntArray1451, (int)var6, var13, 0, (int)var8, (int)var9, var12, var24);
                        var8 += var20;
                        var9 += var22;
                        var12 += var25;
                        var6 += (float)this.anInt1440;
                     }

                  } else {
                     var6 = (float)((int)(var6 + 0.5F));
                     var5 = (float)((int)(var5 + 0.5F));
                     var4 = (float)((int)(var4 + 0.5F)) - var5;
                     var5 -= var6;

                     for(var6 = (float)this.anIntArray1446[(int)var6]; --var5 >= 0.0F; var6 += (float)this.anInt1440) {
                        this.method1506(var1, var2, var3, this.anIntArray1451, (int)var6, var13, 0, (int)var9, (int)var7, var12, var24);
                        var7 += var21;
                        var9 += var22;
                        var12 += var25;
                     }

                     while(--var4 >= 0.0F) {
                        this.method1506(var1, var2, var3, this.anIntArray1451, (int)var6, var13, 0, (int)var9, (int)var8, var12, var24);
                        var8 += var20;
                        var9 += var22;
                        var12 += var25;
                        var6 += (float)this.anInt1440;
                     }

                  }
               }
            }
         }
      }
   }
}
