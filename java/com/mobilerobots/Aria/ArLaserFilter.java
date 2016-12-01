/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2014 Adept Technology

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.mobilerobots.Aria;

public class ArLaserFilter extends ArLaser {
  /* (begin code from javabody_derived typemap) */

  private long swigCPtr;

  /* for internal use by swig only */
  public ArLaserFilter(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.SWIGArLaserFilterUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  /* for internal use by swig only */
  public static long getCPtr(ArLaserFilter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  /* (end code from javabody_derived typemap) */

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArLaserFilter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArLaserFilter(ArLaser laser, String name) {
    this(AriaJavaJNI.new_ArLaserFilter__SWIG_0(ArLaser.getCPtr(laser), laser, name), true);
  }

  public ArLaserFilter(ArLaser laser) {
    this(AriaJavaJNI.new_ArLaserFilter__SWIG_1(ArLaser.getCPtr(laser), laser), true);
  }

  public void setRobot(ArRobot robot) {
    AriaJavaJNI.ArLaserFilter_setRobot(swigCPtr, this, ArRobot.getCPtr(robot), robot);
  }

  public void addToConfig(ArConfig config, String sectionName, String prefix) {
    AriaJavaJNI.ArLaserFilter_addToConfig__SWIG_0(swigCPtr, this, ArConfig.getCPtr(config), config, sectionName, prefix);
  }

  public void addToConfig(ArConfig config, String sectionName) {
    AriaJavaJNI.ArLaserFilter_addToConfig__SWIG_1(swigCPtr, this, ArConfig.getCPtr(config), config, sectionName);
  }

  public boolean blockingConnect() {
    return AriaJavaJNI.ArLaserFilter_blockingConnect(swigCPtr, this);
  }

  public boolean asyncConnect() {
    return AriaJavaJNI.ArLaserFilter_asyncConnect(swigCPtr, this);
  }

  public boolean disconnect() {
    return AriaJavaJNI.ArLaserFilter_disconnect(swigCPtr, this);
  }

  public boolean isConnected() {
    return AriaJavaJNI.ArLaserFilter_isConnected(swigCPtr, this);
  }

  public boolean isTryingToConnect() {
    return AriaJavaJNI.ArLaserFilter_isTryingToConnect(swigCPtr, this);
  }

  public SWIGTYPE_p_void runThread(SWIGTYPE_p_void arg) {
    long cPtr = AriaJavaJNI.ArLaserFilter_runThread(swigCPtr, this, SWIGTYPE_p_void.getCPtr(arg));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public boolean laserCheckParams() {
    return AriaJavaJNI.ArLaserFilter_laserCheckParams(swigCPtr, this);
  }

  public ArLaser getBaseLaser() {
    long cPtr = AriaJavaJNI.ArLaserFilter_getBaseLaser(swigCPtr, this);
    return (cPtr == 0) ? null : new ArLaser(cPtr, false);
  }

}
