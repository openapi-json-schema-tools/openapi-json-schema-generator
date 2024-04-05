# PetfindbystatusServerInfo
PetfindbystatusServerInfo.java

public class PetfindbystatusServerInfo

A class that provides a server, and any needed server info classes
- a class that is a ServerProvider
- a builder for the ServerProvider
- an enum class that stores server index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [PetfindbystatusServerInfo.PetfindbystatusServerInfo1](#petfindbystatusserverinfo1)<br>class that stores a server index |
| static class | [PetfindbystatusServerInfo.PetfindbystatusServerInfoBuilder](#petfindbystatusserverinfobuilder)<br>class that stores a server index |
| enum | [PetfindbystatusServerInfo.ServerIndex](#serverindex)<br>class that stores a server index |

## PetfindbystatusServerInfo1
implements ServerProvider<[ServerIndex](#serverindex)><br>

A class that stores servers and allows one to be returned with a ServerIndex instance

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusServerInfo1(@Nullable [PetfindbystatusServer0](../../../paths/petfindbystatus/servers/PetfindbystatusServer0.md) server0,@Nullable [PetfindbystatusServer1](../../../paths/petfindbystatus/servers/PetfindbystatusServer1.md) server1)<br>Creates an instance using passed in servers |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [PetfindbystatusServer0](../../../paths/petfindbystatus/servers/PetfindbystatusServer0.md) | server0 |
| [PetfindbystatusServer1](../../../paths/petfindbystatus/servers/PetfindbystatusServer1.md) | server1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [PetfindbystatusServerInfoBuilder](#petfindbystatusserverinfobuilder) | petfindbystatusServer0([PetfindbystatusServer0](../../../paths/petfindbystatus/servers/PetfindbystatusServer0.md) server0)<br>sets the server |
| [PetfindbystatusServerInfoBuilder](#petfindbystatusserverinfobuilder) | petfindbystatusServer1([PetfindbystatusServer1](../../../paths/petfindbystatus/servers/PetfindbystatusServer1.md) server1)<br>sets the server |

## PetfindbystatusServerInfoBuilder

a builder for [PetfindbystatusServerInfo1](#petfindbystatusserverinfo1)

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| PetfindbystatusServerInfoBuilder()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Server | getServer([ServerIndex](#serverindex) serverIndex) |


## ServerIndex
enum ServerIndex<br>

### Enum Constant Summary
| Enum Constant And Description |
| ----------------------------- |
| SERVER_0<br>server 0 |
| SERVER_1<br>server 1 |
