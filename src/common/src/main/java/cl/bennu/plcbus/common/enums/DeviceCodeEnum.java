package cl.bennu.plcbus.common.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: _Camilo
 * Date: 28-10-13
 * Time: 11:43 PM
 */
public enum DeviceCodeEnum {

    A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, D1, D2, D3, D4, D5, D6, D7, D8, D9, D10, D11, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F11, G1, G2, G3, G4, G5, G6, G7, G8, G9, G10, G11, H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11 ;


    public static List<DeviceCodeEnum> valuesList() {
        return Arrays.asList(DeviceCodeEnum.values());
    }

    public String getName() {
        return name();
    }

}
