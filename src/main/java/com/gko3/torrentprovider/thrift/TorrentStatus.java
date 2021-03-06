/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.gko3.torrentprovider.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TorrentStatus implements org.apache.thrift.TEnum {
  STATUS_OK(0),
  STATUS_PROCESS(1),
  STATUS_WAIT(2),
  STATUS_ERROR(3),
  STATUS_ERROR_FILE_NOT_EXIST(4),
  STATUS_UNKNOWN(10);

  private final int value;

  private TorrentStatus(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TorrentStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return STATUS_OK;
      case 1:
        return STATUS_PROCESS;
      case 2:
        return STATUS_WAIT;
      case 3:
        return STATUS_ERROR;
      case 4:
        return STATUS_ERROR_FILE_NOT_EXIST;
      case 10:
        return STATUS_UNKNOWN;
      default:
        return null;
    }
  }
}
