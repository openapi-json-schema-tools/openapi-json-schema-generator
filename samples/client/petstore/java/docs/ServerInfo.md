# ServerInfo
ServerInfo.java

public class ServerInfo

A class that provides a server, and any needed server info classes
- a class that is a ServerProvider
- a builder for the ServerProvider
- an enum class that stores server index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [ServerInfo.ServerInfo1](#serverinfo1)<br>class that stores a server index |
| static class | [ServerInfo.ServerInfoBuilder](#serverinfobuilder)<br>class that stores a server index |
| enum | [ServerInfo.ServerIndex](#serverindex)<br>class that stores a server index |

## ServerInfo1
implements ServerProvider<[ServerIndex](#serverindex)><br>

A class that stores servers and allows one to be returned with a ServerIndex instance

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ServerInfo1(@Nullable [Server0](servers/Server0.md) server0,@Nullable [Server1](servers/Server1.md) server1,@Nullable [Server2](servers/Server2.md) server2)<br>Creates an instance using passed in servers |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [Server0](servers/Server0.md) | server0 |
| [Server1](servers/Server1.md) | server1 |
| [Server2](servers/Server2.md) | server2 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| Server | getServer([ServerIndex](#serverindex) serverIndex) |

## ServerInfoBuilder

a builder for [ServerInfo1](#serverinfo1)

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| ServerInfoBuilder()<br>Creates an instance |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [ServerInfoBuilder](#serverinfobuilder) | server0([Server0](servers/Server0.md) server0)<br>sets the server |
| [ServerInfoBuilder](#serverinfobuilder) | server1([Server1](servers/Server1.md) server1)<br>sets the server |
| [ServerInfoBuilder](#serverinfobuilder) | server2([Server2](servers/Server2.md) server2)<br>sets the server |
| [ServerInfo1](#serverinfo1) | build() |

## ServerIndex
enum ServerIndex<br>

### Enum Constant Summary
| Enum Constant And Description |
| ----------------------------- |
| SERVER_0<br>server 0 |
| SERVER_1<br>server 1 |
| SERVER_2<br>server 2 |
