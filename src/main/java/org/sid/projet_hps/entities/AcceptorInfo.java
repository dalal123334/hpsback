package org.sid.projet_hps.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "acceptor_info")
@NoArgsConstructor
@AllArgsConstructor
public class AcceptorInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String acceptorBusinessCode; // Field 26: Acceptor Business Code
    private String acceptorTerminalId; // Field 41: Acceptor Terminal ID
    private String acceptorIdCode; // Field 42: Acceptor ID Code
    private String acceptorNameLocation; // Field 43: Acceptor Name/Location
    private String acceptorStreetAddress; // Field s2: Acceptor Street Address
    private String acceptorCity; // Field s3: Acceptor City

}
