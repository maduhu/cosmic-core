// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//
// Automatically generated by addcopyright.py at 01/29/2013
// Apache License, Version 2.0 (the "License"); you may not use this
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//
// Automatically generated by addcopyright.py at 04/03/2012
package com.cloud.baremetal.networkservice;

import java.util.List;

import com.cloud.baremetal.database.BaremetalDhcpVO;
import com.cloud.deploy.DeployDestination;
import com.cloud.exception.ResourceUnavailableException;
import com.cloud.network.Network;
import com.cloud.network.Network.Provider;
import com.cloud.utils.component.Manager;
import com.cloud.utils.component.PluggableService;
import com.cloud.vm.NicProfile;
import com.cloud.vm.ReservationContext;
import com.cloud.vm.VirtualMachineProfile;

import org.apache.cloudstack.api.AddBaremetalDhcpCmd;
import org.apache.cloudstack.api.ListBaremetalDhcpCmd;

public interface BaremetalDhcpManager extends Manager, PluggableService {
    public static enum BaremetalDhcpType {
        DNSMASQ, DHCPD,
    }

    boolean addVirtualMachineIntoNetwork(Network network, NicProfile nic, VirtualMachineProfile profile, DeployDestination dest, ReservationContext context)
        throws ResourceUnavailableException;

    BaremetalDhcpVO addDchpServer(AddBaremetalDhcpCmd cmd);

    BaremetalDhcpResponse generateApiResponse(BaremetalDhcpVO vo);

    List<BaremetalDhcpResponse> listBaremetalDhcps(ListBaremetalDhcpCmd cmd);

    public static final String BAREMETAL_DHCP_SERVICE_CAPABITLITY = "BaremetalDhcp";
    public static final String BAREMETAL_DHCP_SERVICE_PROPERTIES = "baremetaldhcp_commands.properties";
    public static final Provider BAREMETAL_DHCP_SERVICE_PROVIDER = new Provider("BaremetalDhcpProvider", true);
}
