# RootServerInfo
RootServerInfo.java

public class RootServerInfo

A class that provides a server, and any needed server info classes
- a class that is a ServerProvider
- an enum class that stores server index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [RootServerInfo.RootServerInfo1](#rootserverinfo1)<br>class that stores a server index |
| enum | [RootServerInfo.ServerIndex](#serverindex)<br>class that stores a server index |

## RootServerInfo1
implements ServerProvider<[ServerIndex](#serverindex)><br>

A class that stores servers and allows one to be returned with a ServerIndex instance

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| RootServerInfo1()<br>Creates an instance using default server variable values |
| RootServerInfo1(@Nullable [Server0](servers/Server0.md) server0)<br>Creates an instance using passed in servers |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [Server0](servers/Server0.md) | server0 |

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
