package com.example.source_dsa.Patterns;

import java.util.Arrays;
import java.util.Comparator;

public class TEST {
    public static void main(String[] args) {

 /*       int n = 8;
        for (int i = 1; i < n; i++) {
            int stars = i<=n/2 ?(2*i)-1 :2*(n-i)-1;
            int spacess = i<=n/2 ? n/2-i: (i-n/2);
            for (int spaces = 0; spaces < spacess; spaces++) {
                System.out.print("-");
            }
            System.out.print(stars);
            for (int j = 1; j <= stars; j++) {
                if (j==1||j==stars) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }*/

        String s = "<html class=\"no-js\" lang=\"\">\n" +
                "   <head>\n" +
                "      <meta charset=\"utf-8\">\n" +
                "      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n" +
                "      <title>Flying</title>\n" +
                "      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "   </head>\n" +
                "   <body\n" +
                "      style=\"margin:0;-webkit-font-smoothing: antialiased;-webkit-text-stroke-width: 0;-moz-osx-font-smoothing: grayscale;\">\n" +
                "      <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"max-width:900px; width:100%; text-align:center; margin:0 auto;font-family: helvetica,sans-serif;color:#000\">\n" +
                "         <thead align=\"center\">\n" +
                "            <tr>\n" +
                "               <td><img src=\"https://uatswitch.advatix.net/notification/Switch/Flying.png\" alt=\"Switch thead\" style=\"max-width:100%;vertical-align: bottom;\"></td>\n" +
                "            </tr>\n" +
                "         </thead>\n" +
                "         <tbody>\n" +
                "            <tr>\n" +
                "               <td align=\"center\" style=\"padding-top: 90px;padding-bottom: 70px;\">\n" +
                "                  <p style=\" letter-spacing: 0.5px; font-size: 24px;  text-align: center; font-weight:400;margin:0;max-width: 482px;line-height: 32px;\">\n" +
                "                     Your order has shipped\n" +
                "                  </p>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td align=\"center\" >\n" +
                "                  <div style=\"padding:1px;width:410px;max-width:100%;margin: 0 auto;\">\n" +
                "                  </div>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"padding:0px;\">\n" +
                "                  <h3 style=\" letter-spacing: 1px; color: #17513e; font-size: 28px;  text-align: center; font-weight:400;margin:0;margin-bottom: 35px;\">Order Details</h3>\n" +
                "                  <h4 style=\"font-size: 24px;letter-spacing: 2px;text-align: center; font-weight:bold;margin:0;color:#213575;margin-bottom: 15px;\">TRACKING</h4>\n" +
                "                  <p style=\" letter-spacing: 0.5px; font-size: 20px;  text-align: center; font-weight:400;margin:0; line-height: 28px;\">\n" +
                "                     391587923699\n" +
                "                  </p>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"height: 25px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"text-align:center; padding: 0 0;\">\n" +
                "                  <a href=\"https://www.fedex.com/fedextrack/?tracknumbers=391587923699\"><img src=\"https://uatswitch.advatix.net/notification/Switch/tp.jpg\" alt=\"Track package image\"></a>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td>\n" +
                "                  <h4 style=\"font-size: 24px;letter-spacing: 2px;text-align: center; font-weight:bold;margin:0;color:#213575;margin-bottom: 15px;margin-top: 60px;\">SHIPPING TO</h4>\n" +
                "                  <p style=\" letter-spacing: 0.5px; font-size: 20px;  text-align: center; font-weight:400;margin:0; line-height: 28px;\">\n" +
                "                     Elliott Darvish <br/>8222 Melrose Avenue  <br/> Los Angeles, CA 90046\n" +
                "                  </p>\n" +
                "                  <h4 style=\"font-size: 24px;letter-spacing: 2px;text-align: center; font-weight:bold;margin:0;color:#213575;margin-bottom: 10px;margin-top: 25px;\">ORDER NUMBER</h4>\n" +
                "                  <p style=\" letter-spacing: 0.5px; font-size: 20px;  text-align: center; font-weight:400;margin:0; line-height: 28px;\">\n" +
                "                    62413\n" +
                "                  </p>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "              <tr>\n" +
                "               <td style=\"height: 80px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"vertical-align: bottom;\">\n" +
                "                  <img src=\"https://js3files.s3.us-west-2.amazonaws.com/email-images/mid-div.png\" alt=\"core divider\" style=\"max-width:100%;vertical-align: bottom;\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"padding:70px 10px 95px 10px;background-color: #f4f4f8;vertical-align: top;\">\n" +
                "                  <h3 style=\" letter-spacing: 1px; color: #17513e; font-size: 28px;  text-align: center; font-weight:400;margin:0;margin-bottom: 90px;\">My Order</h3>\n" +
                "                  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:470px;margin:0 auto; margin-bottom: 25px;\">\n" +
                "                     <tbody>\n" +
                "                       <tr>\n" +
                "                           <td style=\"padding-bottom: 20px\">\n" +
                "                              <table style=\"width: 100%; float: right; margin-top:0px;\">\n" +
                "                                 <tbody>\n" +
                "                                    <tr>\n" +
                "                                       <td style=\"padding-right:25px;vertical-align: top;\" width=\"134\" height=\"150\">\n" +
                "                                          <img src=\"https://uatswitch.advatix.net/XPDEL_OUT/fep_thumbnails/1261120435_Switch_Jewelry_Bea Bongiasca_baby_vine_enamel_tendril_ring_turquoise_size_85.jpg\" width=\"134\" height=\"150\" alt=\"No image\"/>\n" +
                "                                       </td>\n" +
                "                                       <td style=\"padding-top:0;vertical-align: top;\">\n" +
                "                                          <table style=\"width: 100%; float: right; margin-top:0px;\">\n" +
                "                                             <tbody>\n" +
                "                                                <tr>\n" +
                "                                                   <td style=\"padding: 0\">\n" +
                "                                                      <div style=\"width: 100%;\">\n" +
                "                                                         <table style=\"width: 100%; float: right; margin-top:0;\">\n" +
                "                                                            <tbody>\n" +
                "                                                               <tr>\n" +
                "                                                                  <td style=\"text-align:left;vertical-align:top;padding: 0;\">\n" +
                "                                                                     <h3 style=\"    text-transform: uppercase;font-family: MinionPro-Regular,Palatino,serif;font-size: 20px;line-height:20px;letter-spacing: 0.5px;font-weight:bold;margin:0;margin-bottom: 0px;\">Bea Bongiasca</h3>\n" +
                "                                                                  </td>\n" +
                "                                                               </tr>\n" +
                "                                                            </tbody>\n" +
                "                                                         </table>\n" +
                "                                                      </div>\n" +
                "                                                   </td>\n" +
                "                                                </tr>\n" +
                "                                             </tbody>\n" +
                "                                          </table>\n" +
                "                                          <table style=\"width: 100%; float: right; margin-top:0px;min-height: 70px\">\n" +
                "                                             <tbody>\n" +
                "                                                <tr>\n" +
                "                                                   <td valign=\"top\" style=\"padding: 0;\">\n" +
                "                                                      <div style=\"width: 100%;\">\n" +
                "                                                         <table style=\"width: 100%; float: right; margin-top:0;\">\n" +
                "                                                            <tbody>\n" +
                "                                                               <tr>\n" +
                "                                                                  <td style=\"text-align:left;vertical-align:top;padding: 0;\">\n" +
                "                                                                     <p style=\" font-family: MinionPro-Regular,Palatino,serif;letter-spacing: 0.5px; font-size: 18px;line-height:20px;font-weight:400;margin:0;text-align: left; \">\n" +
                "                                                                        <span style=\"display: block;\">Tendril Crawler Enamel Earrings (White)</span>\n" +
                "                                                                     </p>\n" +
                "                                                                  </td>\n" +
                "                                                                  <td style=\"vertical-align:bottom;padding-left: 58px;\">\n" +
                "                                                                     <p style=\"font-family: MinionPro-Regular,Palatino,serif; letter-spacing: 0.5px; font-size: 18px;line-height:20px;font-weight:400;margin:0;text-align: right; \">\n" +
                "                                                                        <span style=\"display: block;text-align: right;padding-left: 25px\">x1</span>\n" +
                "                                                                     </p>\n" +
                "                                                                  </td>\n" +
                "                                                               </tr>\n" +
                "                                                            </tbody>\n" +
                "                                                         </table>\n" +
                "                                                      </div>\n" +
                "                                                   </td>\n" +
                "                                                </tr>\n" +
                "                                                <tr>\n" +
                "                                                   <td height=\"0px;\"></td>\n" +
                "                                                </tr>\n" +
                "                                             </tbody>\n" +
                "                                          </table>\n" +
                "                                          <table style=\"width: 100%; float: right; padding-top:35px;\">\n" +
                "                                             <tbody>\n" +
                "                                                <tr>\n" +
                "                                                   <td style=\"text-align:left;vertical-align:bottom;\">\n" +
                "                                                      <p style=\"font-family: MinionPro-Regular,Palatino,serif; letter-spacing: 0.5px; font-size: 20px;font-weight:400;margin:0;text-align: left;\">\n" +
                "                                                         <span style=\"display: block;\">Retail Value</span>\n" +
                "                                                      </p>\n" +
                "                                                   </td>\n" +
                "                                                   <td style=\"vertical-align:bottom\">\n" +
                "                                                      <p style=\"font-family: MinionPro-Regular,Palatino,serif; letter-spacing: 0.5px; font-size: 20px;font-weight:400;margin:0; text-align: right;\">\n" +
                "                                                         <span style=\"display: block;text-align: right;\">$685.00</span>\n" +
                "                                                      </p>\n" +
                "                                                   </td>\n" +
                "                                                </tr>\n" +
                "                                             </tbody>\n" +
                "                                          </table>\n" +
                "                                       </td>\n" +
                "                                    </tr>\n" +
                "                                    <tr>\n" +
                "                                       <td colspan=\"2\" style=\"border-bottom: 2px solid #000;width: 100%;padding-top: 20px;\"></td>\n" +
                "                                    </tr>\n" +
                "                                 </tbody>\n" +
                "                              </table>\n" +
                "                           </td>\n" +
                "                        </tr><tr>\n" +
                "                           <td style=\"padding-bottom: 20px\">\n" +
                "                              <table style=\"width: 100%; float: right; margin-top:0px;\">\n" +
                "                                 <tbody>\n" +
                "                                    <tr>\n" +
                "                                       <td style=\"padding-right:25px;vertical-align: top;\" width=\"134\" height=\"150\">\n" +
                "                                          <img src=\"https://uatswitch.advatix.net/XPDEL_OUT/fep_thumbnails/1261120435_Switch_Jewelry_Bea Bongiasca_baby_vine_enamel_tendril_ring_turquoise_size_85.jpg\" width=\"134\" height=\"150\" alt=\"No image\"/>\n" +
                "                                       </td>\n" +
                "                                       <td style=\"padding-top:0;vertical-align: top;\">\n" +
                "                                          <table style=\"width: 100%; float: right; margin-top:0px;\">\n" +
                "                                             <tbody>\n" +
                "                                                <tr>\n" +
                "                                                   <td style=\"padding: 0\">\n" +
                "                                                      <div style=\"width: 100%;\">\n" +
                "                                                         <table style=\"width: 100%; float: right; margin-top:0;\">\n" +
                "                                                            <tbody>\n" +
                "                                                               <tr>\n" +
                "                                                                  <td style=\"text-align:left;vertical-align:top;padding: 0;\">\n" +
                "                                                                     <h3 style=\"    text-transform: uppercase;font-family: MinionPro-Regular,Palatino,serif;font-size: 20px;line-height:20px;letter-spacing: 0.5px;font-weight:bold;margin:0;margin-bottom: 0px;\">Bea Bongiasca</h3>\n" +
                "                                                                  </td>\n" +
                "                                                               </tr>\n" +
                "                                                            </tbody>\n" +
                "                                                         </table>\n" +
                "                                                      </div>\n" +
                "                                                   </td>\n" +
                "                                                </tr>\n" +
                "                                             </tbody>\n" +
                "                                          </table>\n" +
                "                                          <table style=\"width: 100%; float: right; margin-top:0px;min-height: 70px\">\n" +
                "                                             <tbody>\n" +
                "                                                <tr>\n" +
                "                                                   <td valign=\"top\" style=\"padding: 0;\">\n" +
                "                                                      <div style=\"width: 100%;\">\n" +
                "                                                         <table style=\"width: 100%; float: right; margin-top:0;\">\n" +
                "                                                            <tbody>\n" +
                "                                                               <tr>\n" +
                "                                                                  <td style=\"text-align:left;vertical-align:top;padding: 0;\">\n" +
                "                                                                     <p style=\" font-family: MinionPro-Regular,Palatino,serif;letter-spacing: 0.5px; font-size: 18px;line-height:20px;font-weight:400;margin:0;text-align: left; \">\n" +
                "                                                                        <span style=\"display: block;\">Small Tendril Circle Hoop Earrings (Orange)</span>\n" +
                "                                                                     </p>\n" +
                "                                                                  </td>\n" +
                "                                                                  <td style=\"vertical-align:bottom;padding-left: 58px;\">\n" +
                "                                                                     <p style=\"font-family: MinionPro-Regular,Palatino,serif; letter-spacing: 0.5px; font-size: 18px;line-height:20px;font-weight:400;margin:0;text-align: right; \">\n" +
                "                                                                        <span style=\"display: block;text-align: right;padding-left: 25px\">x1</span>\n" +
                "                                                                     </p>\n" +
                "                                                                  </td>\n" +
                "                                                               </tr>\n" +
                "                                                            </tbody>\n" +
                "                                                         </table>\n" +
                "                                                      </div>\n" +
                "                                                   </td>\n" +
                "                                                </tr>\n" +
                "                                                <tr>\n" +
                "                                                   <td height=\"0px;\"></td>\n" +
                "                                                </tr>\n" +
                "                                             </tbody>\n" +
                "                                          </table>\n" +
                "                                          <table style=\"width: 100%; float: right; padding-top:35px;\">\n" +
                "                                             <tbody>\n" +
                "                                                <tr>\n" +
                "                                                   <td style=\"text-align:left;vertical-align:bottom;\">\n" +
                "                                                      <p style=\"font-family: MinionPro-Regular,Palatino,serif; letter-spacing: 0.5px; font-size: 20px;font-weight:400;margin:0;text-align: left;\">\n" +
                "                                                         <span style=\"display: block;\">Retail Value</span>\n" +
                "                                                      </p>\n" +
                "                                                   </td>\n" +
                "                                                   <td style=\"vertical-align:bottom\">\n" +
                "                                                      <p style=\"font-family: MinionPro-Regular,Palatino,serif; letter-spacing: 0.5px; font-size: 20px;font-weight:400;margin:0; text-align: right;\">\n" +
                "                                                         <span style=\"display: block;text-align: right;\">$845.00</span>\n" +
                "                                                      </p>\n" +
                "                                                   </td>\n" +
                "                                                </tr>\n" +
                "                                             </tbody>\n" +
                "                                          </table>\n" +
                "                                       </td>\n" +
                "                                    </tr>\n" +
                "                                    <tr>\n" +
                "                                       <td colspan=\"2\" style=\"border-bottom: 2px solid #000;width: 100%;padding-top: 20px;\"></td>\n" +
                "                                    </tr>\n" +
                "                                 </tbody>\n" +
                "                              </table>\n" +
                "                           </td>\n" +
                "                        </tr><tr>\n" +
                "                           <td style=\"padding-bottom: 20px\">\n" +
                "                              <table style=\"width: 100%; float: right; margin-top:0px;\">\n" +
                "                                 <tbody>\n" +
                "                                    <tr>\n" +
                "                                       <td style=\"padding-right:25px;vertical-align: top;\" width=\"134\" height=\"150\">\n" +
                "                                          <img src=\"https://uatswitch.advatix.net/XPDEL_OUT/fep_thumbnails/1261120435_Switch_Jewelry_Bea Bongiasca_baby_vine_enamel_tendril_ring_turquoise_size_85.jpg\" width=\"134\" height=\"150\" alt=\"No image\"/>\n" +
                "                                       </td>\n" +
                "                                       <td style=\"padding-top:0;vertical-align: top;\">\n" +
                "                                          <table style=\"width: 100%; float: right; margin-top:0px;\">\n" +
                "                                             <tbody>\n" +
                "                                                <tr>\n" +
                "                                                   <td style=\"padding: 0\">\n" +
                "                                                      <div style=\"width: 100%;\">\n" +
                "                                                         <table style=\"width: 100%; float: right; margin-top:0;\">\n" +
                "                                                            <tbody>\n" +
                "                                                               <tr>\n" +
                "                                                                  <td style=\"text-align:left;vertical-align:top;padding: 0;\">\n" +
                "                                                                     <h3 style=\"    text-transform: uppercase;font-family: MinionPro-Regular,Palatino,serif;font-size: 20px;line-height:20px;letter-spacing: 0.5px;font-weight:bold;margin:0;margin-bottom: 0px;\">Bea Bongiasca</h3>\n" +
                "                                                                  </td>\n" +
                "                                                               </tr>\n" +
                "                                                            </tbody>\n" +
                "                                                         </table>\n" +
                "                                                      </div>\n" +
                "                                                   </td>\n" +
                "                                                </tr>\n" +
                "                                             </tbody>\n" +
                "                                          </table>\n" +
                "                                          <table style=\"width: 100%; float: right; margin-top:0px;min-height: 70px\">\n" +
                "                                             <tbody>\n" +
                "                                                <tr>\n" +
                "                                                   <td valign=\"top\" style=\"padding: 0;\">\n" +
                "                                                      <div style=\"width: 100%;\">\n" +
                "                                                         <table style=\"width: 100%; float: right; margin-top:0;\">\n" +
                "                                                            <tbody>\n" +
                "                                                               <tr>\n" +
                "                                                                  <td style=\"text-align:left;vertical-align:top;padding: 0;\">\n" +
                "                                                                     <p style=\" font-family: MinionPro-Regular,Palatino,serif;letter-spacing: 0.5px; font-size: 18px;line-height:20px;font-weight:400;margin:0;text-align: left; \">\n" +
                "                                                                        <span style=\"display: block;\">Two Tone Asymmetrical Flower Power Earrings (Red & Japan Orange)</span>\n" +
                "                                                                     </p>\n" +
                "                                                                  </td>\n" +
                "                                                                  <td style=\"vertical-align:bottom;padding-left: 58px;\">\n" +
                "                                                                     <p style=\"font-family: MinionPro-Regular,Palatino,serif; letter-spacing: 0.5px; font-size: 18px;line-height:20px;font-weight:400;margin:0;text-align: right; \">\n" +
                "                                                                        <span style=\"display: block;text-align: right;padding-left: 25px\">x1</span>\n" +
                "                                                                     </p>\n" +
                "                                                                  </td>\n" +
                "                                                               </tr>\n" +
                "                                                            </tbody>\n" +
                "                                                         </table>\n" +
                "                                                      </div>\n" +
                "                                                   </td>\n" +
                "                                                </tr>\n" +
                "                                                <tr>\n" +
                "                                                   <td height=\"0px;\"></td>\n" +
                "                                                </tr>\n" +
                "                                             </tbody>\n" +
                "                                          </table>\n" +
                "                                          <table style=\"width: 100%; float: right; padding-top:35px;\">\n" +
                "                                             <tbody>\n" +
                "                                                <tr>\n" +
                "                                                   <td style=\"text-align:left;vertical-align:bottom;\">\n" +
                "                                                      <p style=\"font-family: MinionPro-Regular,Palatino,serif; letter-spacing: 0.5px; font-size: 20px;font-weight:400;margin:0;text-align: left;\">\n" +
                "                                                         <span style=\"display: block;\">Retail Value</span>\n" +
                "                                                      </p>\n" +
                "                                                   </td>\n" +
                "                                                   <td style=\"vertical-align:bottom\">\n" +
                "                                                      <p style=\"font-family: MinionPro-Regular,Palatino,serif; letter-spacing: 0.5px; font-size: 20px;font-weight:400;margin:0; text-align: right;\">\n" +
                "                                                         <span style=\"display: block;text-align: right;\">$495.00</span>\n" +
                "                                                      </p>\n" +
                "                                                   </td>\n" +
                "                                                </tr>\n" +
                "                                             </tbody>\n" +
                "                                          </table>\n" +
                "                                       </td>\n" +
                "                                    </tr>\n" +
                "                                    <tr>\n" +
                "                                       <td colspan=\"2\" style=\"border-bottom: 2px solid #000;width: 100%;padding-top: 20px;\"></td>\n" +
                "                                    </tr>\n" +
                "                                 </tbody>\n" +
                "                              </table>\n" +
                "                           </td>\n" +
                "                        </tr>\n" +
                "                     </tbody>\n" +
                "                  </table>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"text-align:center; padding:  0;\">\n" +
                "                  <img src=\"https://uatswitch.advatix.net/notification/Switch/line.jpg\" alt=\"Track package image\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"height: 25px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr  style=\"width: 100%\">\n" +
                "               <td style=\"width: 100%\">\n" +
                "                  <a style=\"text-decoration:none!important;text-underline:none;width:100%;color:#000;margin:0; letter-spacing: 2px; font-size: 18px;\" href=\"https://joinswitch.com/how-it-works\">HOW IT WORKS</a>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"height: 25px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"text-align:center; padding:  0;\">\n" +
                "                  <img src=\"https://uatswitch.advatix.net/notification/Switch/line.jpg\" alt=\"Track package image\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"height: 25px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td>\n" +
                "                  <a style=\"text-decoration:none;width:100%;color:#000;margin:0; letter-spacing: 2px; font-size: 18px;\" href=\"https://joinswitch.com/plans\">PLANS</a>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"height: 25px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"text-align:center; padding:  0;\">\n" +
                "                  <img src=\"https://uatswitch.advatix.net/notification/Switch/line.jpg\" alt=\"Track package image\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"height: 25px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td>\n" +
                "                  <a style=\"text-decoration:none;width:100%;color:#000;margin:0; letter-spacing: 2px; font-size: 18px;\" href=\"https://joinswitch.com/collections\">COLLECTIONS</a>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"height: 25px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"text-align:center; padding:  0;\">\n" +
                "                  <img src=\"https://uatswitch.advatix.net/notification/Switch/line.jpg\" alt=\"Track package image\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"height: 25px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td>\n" +
                "                  <a style=\"text-decoration:none;width:100%;color:#000;margin:0; letter-spacing: 2px; font-size: 18px;\" href=\"https://joinswitch.com/contact\">HELP</a>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"height: 25px\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td>\n" +
                "                  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:100%;\">\n" +
                "                     <tbody>\n" +
                "                        <tr>\n" +
                "                           <td style=\"padding: 20px 4px;text-align:center;background-color:#000;color:#fff;width: 33.3%;\">\n" +
                "                              <a href=\"https://www.facebook.com/Switch\"><img src=\"https://js3files.s3.us-west-2.amazonaws.com/email-images/facebook.jpg\" alt=\"Facebook\"></a>\n" +
                "                           </td>\n" +
                "                           <td style=\"padding: 20px 4px;text-align:center;background-color:#000;color:#fff;width: 33.3%;\">\n" +
                "                              FOLLOW US ON\n" +
                "                           </td>\n" +
                "                           <td style=\"padding: 20px 4px;text-align:center;background-color:#000;color:#fff;width: 33.3%;\">\n" +
                "                              <a href=\"https://www.instagram.com/switch/\"><img src=\"https://js3files.s3.us-west-2.amazonaws.com/email-images/instagram.jpg\" alt=\"instagram\"></a>\n" +
                "                           </td>\n" +
                "                        </tr>\n" +
                "                     </tbody>\n" +
                "                  </table>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"padding: 50px 4px;\">\n" +
                "                  <img style=\"max-width: 100%;\" src=\"https://js3files.s3.us-west-2.amazonaws.com/email-images/address.jpg\" alt=\"Address Switch\">\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "               <td style=\"padding-top:30px; width:100%; text-transform:uppercase;padding-bottom: 50px;\">\n" +
                "                  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"width:100%;\">\n" +
                "                     <tbody>\n" +
                "                        <tr>\n" +
                "                           <td style=\"width: 30%;border-right: 2px solid #000;text-align: center;padding: 0 2px;\">\n" +
                "                              <a href=\"https://joinswitch.com/termsandconditions\"\n" +
                "                                 style=\"color:#000; text-decoration:none; font-size:16px; display:inline-block; letter-spacing: 2px;  line-height:16px;width:100%\">\n" +
                "                              TERMS</a>\n" +
                "                           </td>\n" +
                "                           <td style=\"width: 40%;border-right: 2px solid #000;text-align: center;padding: 0 2px;\">\n" +
                "                              <a href=\"#unsubscribe\"\n" +
                "                                 style=\"color:#000; text-decoration:none; font-size:16px; display:inline-block; letter-spacing: 2px;  line-height:16px;width:100%\">\n" +
                "                              UNSUBSCRIBE</a>\n" +
                "                           </td>\n" +
                "                           <td style=\"width: 30%;text-align: center;padding: 0 2px;\">\n" +
                "                              <a href=\"https://joinswitch.com/privacy\"\n" +
                "                                 style=\"color:#000; text-decoration:none; font-size:16px; display:inline-block; letter-spacing: 2px;  line-height:16px;width:100%\">PRIVACY</a>\n" +
                "                           </td>\n" +
                "                        </tr>\n" +
                "                     </tbody>\n" +
                "                  </table>\n" +
                "               </td>\n" +
                "            </tr>\n" +
                "         </tbody>\n" +
                "      </table>\n" +
                "   </body>\n" +
                "</html>";


        String[] sort = {"flower","flow","flight"};
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));


    }
}