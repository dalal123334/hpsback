package org.sid.projet_hps.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AcceptorInfoDTO {
    private String acceptorBusinessCode;
    private String acceptorTerminalId;
    private String acceptorIdCode;
    private String acceptorNameLocation;
    private String acceptorStreetAddress;
    private String acceptorCity;
}
