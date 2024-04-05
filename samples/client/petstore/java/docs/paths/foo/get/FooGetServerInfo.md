# FooGetServerInfo
FooGetServerInfo.java

public class FooGetServerInfo

A class that provides a server, and any needed server info classes
- a class that is a ServerProvider
- a builder for the ServerProvider
- an enum class that stores server index values

## Nested Class Summary
| Modifier and Type | Class and Description |
| ----------------- | --------------------- |
| static class | [FooGetServerInfo.FooGetServerInfo1](#foogetserverinfo1)<br>class that stores a server index |
| static class | [FooGetServerInfo.FooGetServerInfoBuilder](#foogetserverinfobuilder)<br>class that stores a server index |
| enum | [FooGetServerInfo.ServerIndex](#serverindex)<br>class that stores a server index |

## FooGetServerInfo1
implements ServerProvider<[ServerIndex](#serverindex)><br>

A class that stores servers and allows one to be returned with a ServerIndex instance

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServerInfo1(@Nullable [FooGetServer0](../../../paths/foo/get/servers/FooGetServer0.md) server0,@Nullable [FooGetServer1](../../../paths/foo/get/servers/FooGetServer1.md) server1)<br>Creates an instance using passed in servers |

### Field Summary
| Modifier and Type | Field and Description |
| ----------------- | --------------------- |
| [FooGetServer0](../../../paths/foo/get/servers/FooGetServer0.md) | server0 |
| [FooGetServer1](../../../paths/foo/get/servers/FooGetServer1.md) | server1 |

### Method Summary
| Modifier and Type | Method and Description |
| ----------------- | ---------------------- |
| [FooGetServerInfoBuilder](#foogetserverinfobuilder) | fooGetServer0([FooGetServer0](../../../paths/foo/get/servers/FooGetServer0.md) server0)<br>sets the server |
| [FooGetServerInfoBuilder](#foogetserverinfobuilder) | fooGetServer1([FooGetServer1](../../../paths/foo/get/servers/FooGetServer1.md) server1)<br>sets the server |

## FooGetServerInfoBuilder

a builder for [FooGetServerInfo1](#foogetserverinfo1)

### Constructor Summary
| Constructor and Description |
| --------------------------- |
| FooGetServerInfoBuilder()<br>Creates an instance |

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
