import { UserDTO } from './UserDTO';
import { LocationDTO } from './LocationDTO';
import { BoardLinksDTO } from './BoardLinksDTO';

export class BoardDTO {
  id: string;
  owner: UserDTO;
  subscriptions: LocationDTO[];
  _links: BoardLinksDTO;
}
